package org.example.ast;

import org.example.LispParser;
import org.example.LispParserBaseVisitor;
import org.example.ast.basic_expression.NumberNode;
import org.example.ast.basic_expression.StringNode;
import org.example.ast.basic_expression.SymbolNode;
import org.example.ast.declarations_and_blocks.*;
import org.example.ast.error_handling.*;
import org.example.ast.expression.*;
import org.example.ast.list_operations.*;
import org.example.ast.miscellaneous.*;
import org.example.ast.oop.DefclassNode;
import org.example.ast.oop.DefgenericNode;
import org.example.ast.oop.DefmethodNode;
import org.example.ast.predicates.EvenpNode;
import org.example.ast.predicates.OddpNode;
import org.example.ast.program_constructs.*;
import org.example.ast.set_operations.IntersectionNode;
import org.example.ast.set_operations.SetDifferenceNode;
import org.example.ast.set_operations.UnionNode;
import org.example.ast.special_forms.*;
import org.example.ast.stack_operations.PopNode;
import org.example.ast.stack_operations.PushNode;
import org.example.ast.type_predicates_and_operations.*;

public class Visitor extends LispParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(LispParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode();
        for (LispParser.S_exprContext expr : ctx.s_expr()) {
            program.expressions.add(visit(expr));
        }
        return program;
    }

    @Override
    public ASTNode visitS_expr(LispParser.S_exprContext ctx) {
        if (ctx.atom() != null) {
            return visitAtom(ctx.atom());
        } else if (ctx.list() != null) {
            return visitList(ctx.list());
        }
        return null;
    }

    @Override
    public ASTNode visitAtom(LispParser.AtomContext ctx) {
        if (ctx.NUMBER() != null) {
            return new NumberNode(ctx.NUMBER().getText());
        } else if (ctx.SYMBOL() != null) {
            return new SymbolNode(ctx.SYMBOL().getText());
        } else if (ctx.STRING() != null) {
            return new StringNode(ctx.STRING().getText());
        } else if (ctx.QUOTE() != null) {
            return new QuoteNode(visit(ctx.s_expr()));
        }
        return null;
    }

    @Override
    public ASTNode visitList(LispParser.ListContext ctx) {
        if (ctx.function_call() != null) {
            return visitFunction_call(ctx.function_call());
        } else if (ctx.arithmetic_expr() != null) {
            return visitArithmetic_expr(ctx.arithmetic_expr());
        } else if (ctx.comparison_expr() != null) {
            return visitComparison_expr(ctx.comparison_expr());
        } else if (ctx.logical_expr() != null) {
            return visitLogical_expr(ctx.logical_expr());
        } else if (ctx.list_operation() != null) {
            return visitList_operation(ctx.list_operation());
        } else if (ctx.other_expressions() != null) {
            return visitOther_expressions(ctx.other_expressions());
        } else if (ctx.special_form() != null) {
            return visitSpecial_form(ctx.special_form());
        }
        return null;
    }

    @Override
    public ASTNode visitFunction_call(LispParser.Function_callContext ctx) {
        FuncallNode funcall = new FuncallNode();
        funcall.function = new SymbolNode(ctx.SYMBOL().getText());
        for (LispParser.S_exprContext arg : ctx.s_expr()) {
            funcall.arguments.add(visit(arg));
        }
        return funcall;
    }

    @Override
    public ASTNode visitArithmetic_expr(LispParser.Arithmetic_exprContext ctx) {
        ArithmeticExprNode arithmeticExpr = new ArithmeticExprNode();
        arithmeticExpr.operator = ctx.getChild(0).getText();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            arithmeticExpr.operands.add(visit((LispParser.S_exprContext) ctx.getChild(i)));
        }
        return arithmeticExpr;
    }

    @Override
    public ASTNode visitComparison_expr(LispParser.Comparison_exprContext ctx) {
        ComparisonExprNode comparisonExpr = new ComparisonExprNode();
        comparisonExpr.operator = ctx.getChild(0).getText();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            comparisonExpr.operands.add(visit((LispParser.S_exprContext) ctx.getChild(i)));
        }
        return comparisonExpr;
    }

    @Override
    public ASTNode visitLogical_expr(LispParser.Logical_exprContext ctx) {
        LogicalExprNode logicalExpr = new LogicalExprNode();
        logicalExpr.operator = ctx.getChild(0).getText();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            logicalExpr.operands.add(visit((LispParser.S_exprContext) ctx.getChild(i)));
        }
        return logicalExpr;
    }

    @Override
    public ASTNode visitList_operation(LispParser.List_operationContext ctx) {
        ListOperationNode listOperation = new ListOperationNode();
        listOperation.operation = ctx.getChild(0).getText();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            listOperation.arguments.add(visit((LispParser.S_exprContext) ctx.getChild(i)));
        }
        return listOperation;
    }

    @Override
    public ASTNode visitPrint_expr(LispParser.Print_exprContext ctx) {
        OtherExprNode printExpr = new OtherExprNode();
        printExpr.operation = "print";
        printExpr.arguments.add(visit(ctx.s_expr(0)));
        return printExpr;
    }

//    @Override
//    public ASTNode visitEval_expr(LispParser.Eval_exprContext ctx) {
//        OtherExprNode evalExpr = new OtherExprNode();
//        evalExpr.operation = "eval";
//        evalExpr.arguments.add(visit(ctx.s_expr()));
//        return evalExpr;
//    }

//    @Override
//    public ASTNode visitLoad_expr(LispParser.Load_exprContext ctx) {
//        OtherExprNode loadExpr = new OtherExprNode();
//        loadExpr.operation = "load";
//        loadExpr.arguments.add(new StringNode(ctx.STRING_WITH_DIRECTIVES().getText()));
//        return loadExpr;
//    }

    @Override
    public ASTNode visitRead_expr(LispParser.Read_exprContext ctx) {
        OtherExprNode readExpr = new OtherExprNode();
        readExpr.operation = "read";
        return readExpr;
    }

    @Override
    public ASTNode visitOther_expressions(LispParser.Other_expressionsContext ctx) {
        if (ctx.print_expr() != null) {
            return visitPrint_expr(ctx.print_expr());
//        } else if (ctx.eval_expr() != null) {
//            return visitEval_expr(ctx.eval_expr());
//        } else if (ctx.load_expr() != null) {
//            return visitLoad_expr(ctx.load_expr());
        } else if (ctx.read_expr() != null) {
            return visitRead_expr(ctx.read_expr());
        }
        return null;
    }

    @Override
    public ASTNode visitSpecial_form(LispParser.Special_formContext ctx) {
        if (ctx.defun_form() != null) {
            return visitDefun_form(ctx.defun_form());
//        } else if (ctx.if_form() != null) {
//            return visitIf_form(ctx.if_form());
        } else if (ctx.defparameter_form() != null) {
            return visitDefparameter_form(ctx.defparameter_form());
        } else if (ctx.let_form() != null) {
            return visitLet_form(ctx.let_form());
        } else if (ctx.lambda_form() != null) {
            return visitLambda_form(ctx.lambda_form());
        } else if (ctx.quote_form() != null) {
            return visitQuote_form(ctx.quote_form());
        } else if (ctx.setq_form() != null) {
            return visitSetq_form(ctx.setq_form());
        } else if (ctx.funcall_form() != null) {
            return visitFuncall_form(ctx.funcall_form());
        } else if (ctx.cond_form() != null) {
            return visitCond_form(ctx.cond_form());
        } else if (ctx.when_form() != null) {
            return visitWhen_form(ctx.when_form());
        } else if (ctx.unless_form() != null) {
            return visitUnless_form(ctx.unless_form());
        } else if (ctx.progn_form() != null) {
            return visitProgn_form(ctx.progn_form());
        } else if (ctx.loop_form() != null) {
            return visitLoop_form(ctx.loop_form());
        } else if (ctx.return_form() != null) {
            return visitReturn_form(ctx.return_form());
        } else if (ctx.case_form() != null) {
            return visitCase_form(ctx.case_form());
//        } else if (ctx.otherwise_form() != null) {
//            return visitOtherwise_form(ctx.otherwise_form());
        } else if (ctx.evenp_form() != null) {
            return visitEvenp_form(ctx.evenp_form());
        } else if (ctx.oddp_form() != null) {
            return visitOddp_form(ctx.oddp_form());
        } else if (ctx.mapcar_form() != null) {
            return visitMapcar_form(ctx.mapcar_form());
        } else if (ctx.apply_form() != null) {
            return visitApply_form(ctx.apply_form());
        } else if (ctx.member_form() != null) {
            return visitMember_form(ctx.member_form());
        } else if (ctx.assoc_form() != null) {
            return visitAssoc_form(ctx.assoc_form());
        } else if (ctx.remove_form() != null) {
            return visitRemove_form(ctx.remove_form());
        } else if (ctx.find_form() != null) {
            return visitFind_form(ctx.find_form());
        } else if (ctx.position_form() != null) {
            return visitPosition_form(ctx.position_form());
        } else if (ctx.substring_form() != null) {
            return visitSubstring_form(ctx.substring_form());
        } else if (ctx.concatenate_form() != null) {
            return visitConcatenate_form(ctx.concatenate_form());
        } else if (ctx.char_form() != null) {
            return visitChar_form(ctx.char_form());
        } else if (ctx.aref_form() != null) {
            return visitAref_form(ctx.aref_form());
        } else if (ctx.sort_form() != null) {
            return visitSort_form(ctx.sort_form());
        } else if (ctx.merge_form() != null) {
            return visitMerge_form(ctx.merge_form());
        } else if (ctx.subsetp_form() != null) {
            return visitSubsetp_form(ctx.subsetp_form());
        } else if (ctx.reduce_form() != null) {
            return visitReduce_form(ctx.reduce_form());
        } else if (ctx.filter_form() != null) {
            return visitFilter_form(ctx.filter_form());
        } else if (ctx.every_form() != null) {
            return visitEvery_form(ctx.every_form());
        } else if (ctx.some_form() != null) {
            return visitSome_form(ctx.some_form());
        } else if (ctx.null_form() != null) {
            return visitNull_form(ctx.null_form());
        } else if (ctx.typeof_form() != null) {
            return visitTypeof_form(ctx.typeof_form());
        } else if (ctx.eq_form() != null) {
            return visitEq_form(ctx.eq_form());
        } else if (ctx.eql_form() != null) {
            return visitEql_form(ctx.eql_form());
        } else if (ctx.equalp_form() != null) {
            return visitEqualp_form(ctx.equalp_form());
        } else if (ctx.typep_form() != null) {
            return visitTypep_form(ctx.typep_form());
        } else if (ctx.subtypep_form() != null) {
            return visitSubtypep_form(ctx.subtypep_form());
        } else if (ctx.coerce_form() != null) {
            return visitCoerce_form(ctx.coerce_form());
        } else if (ctx.declare_form() != null) {
            return visitDeclare_form(ctx.declare_form());
        } else if (ctx.the_form() != null) {
            return visitThe_form(ctx.the_form());
        } else if (ctx.block_form() != null) {
            return visitBlock_form(ctx.block_form());
        } else if (ctx.return_from_form() != null) {
            return visitReturn_from_form(ctx.return_from_form());
        } else if (ctx.catch_form() != null) {
            return visitCatch_form(ctx.catch_form());
        } else if (ctx.throw_form() != null) {
            return visitThrow_form(ctx.throw_form());
        } else if (ctx.tagbody_form() != null) {
            return visitTagbody_form(ctx.tagbody_form());
        } else if (ctx.go_form() != null) {
            return visitGo_form(ctx.go_form());
        } else if (ctx.defclass_form() != null) {
            return visitDefclass_form(ctx.defclass_form());
        } else if (ctx.defmethod_form() != null) {
            return visitDefmethod_form(ctx.defmethod_form());
        } else if (ctx.defgeneric_form() != null) {
            return visitDefgeneric_form(ctx.defgeneric_form());
        } else if (ctx.intersection_form() != null) {
            return visitIntersection_form(ctx.intersection_form());
        } else if (ctx.union_form() != null) {
            return visitUnion_form(ctx.union_form());
        } else if (ctx.set_difference_form() != null) {
            return visitSet_difference_form(ctx.set_difference_form());
        } else if (ctx.signal_form() != null) {
            return visitSignal_form(ctx.signal_form());
        } else if (ctx.error_form() != null) {
            return visitError_form(ctx.error_form());
        } else if (ctx.warn_form() != null) {
            return visitWarn_form(ctx.warn_form());
        } else if (ctx.break_form() != null) {
            return visitBreak_form(ctx.break_form());
        } else if (ctx.continue_form() != null) {
            return visitContinue_form(ctx.continue_form());
        } else if (ctx.store_value_form() != null) {
            return visitStore_value_form(ctx.store_value_form());
        } else if (ctx.use_value_form() != null) {
            return visitUse_value_form(ctx.use_value_form());
        } else if (ctx.abort_form() != null) {
            return visitAbort_form(ctx.abort_form());
        } else if (ctx.typecase_form() != null) {
            return visitTypecase_form(ctx.typecase_form());
        } else if (ctx.etypecase_form() != null) {
            return visitEtypecase_form(ctx.etypecase_form());
        } else if (ctx.ctypecase_form() != null) {
            return visitCtypecase_form(ctx.ctypecase_form());
        } else if (ctx.prog_form() != null) {
            return visitProg_form(ctx.prog_form());
        } else if (ctx.prog1_form() != null) {
            return visitProg1_form(ctx.prog1_form());
        } else if (ctx.prog2_form() != null) {
            return visitProg2_form(ctx.prog2_form());
        } else if (ctx.do_form() != null) {
            return visitDo_form(ctx.do_form());
        } else if (ctx.dolist_form() != null) {
            return visitDolist_form(ctx.dolist_form());
        } else if (ctx.dotimes_form() != null) {
            return visitDotimes_form(ctx.dotimes_form());
        } else if (ctx.next_method_p_form() != null) {
            return visitNext_method_p_form(ctx.next_method_p_form());
        } else if (ctx.push_form() != null) {
            return visitPush_form(ctx.push_form());
        } else if (ctx.pop_form() != null) {
            return visitPop_form(ctx.pop_form());
        } else if (ctx.fact_form() != null) {
            return visitFact_form(ctx.fact_form());
        } else if (ctx.optional_form() != null) {
            return visitOptional_form(ctx.optional_form());
        } else if (ctx.reset_form() != null) {
            return visitReset_form(ctx.reset_form());
        } else if (ctx.key_form() != null) {
            return visitKey_form(ctx.key_form());
        } else if (ctx.make_array_form() != null) {
            return visitMake_array_form(ctx.make_array_form());
        } else if (ctx.defstruct_form() != null) {
            return visitDefstruct_form(ctx.defstruct_form());
        } else if (ctx.setf_form() != null) {
            return visitSetf_form(ctx.setf_form());
        } else if (ctx.incf_form() != null) {
            return visitIncf_form(ctx.incf_form());
        }
        return null;
    }

//    @Override
//    public ASTNode visitIf_form(LispParser.If_formContext ctx) {
//        IfNode ifNode = new IfNode();
//        ifNode.condition = visit(ctx.s_expr(0));
//        ifNode.thenBranch = visit(ctx.s_expr(1));
//        if (ctx.s_expr().size() > 2) {
//            ifNode.elseBranch = visit(ctx.s_expr(2));
//        }
//        return ifNode;
//    }

//    @Override
//    public ASTNode visitDefun_form(LispParser.Defun_formContext ctx) {
//        DefunNode defun = new DefunNode();
//        defun.functionName = ctx.SYMBOL().getText();
//        for (LispParser.SymbolAtomContext param : ctx.SYMBOL()) {
//            defun.parameters.add(param.getText());
//        }
//        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
//            defun.body.add(visit(bodyExpr));
//        }
//        return defun;
//    }

    @Override
    public ASTNode visitDefparameter_form(LispParser.Defparameter_formContext ctx) {
        DefparameterNode defparameter = new DefparameterNode();
        defparameter.name = ctx.SYMBOL().getText();
        defparameter.value = visit(ctx.s_expr());
        return defparameter;
    }

//    @Override
//    public ASTNode visitLet_form(LispParser.Let_formContext ctx) {
//        LetNode let = new LetNode();
//        for (LispParser.LetBindingContext bindingCtx : ctx.let_binding()) {
//            LetNode.Binding binding = new LetNode.Binding(
//                    bindingCtx.SYMBOL().getText(),
//                    visit(bindingCtx.s_expr())
//            );
//            let.bindings.add(binding);
//        }
//        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
//            let.body.add(visit(bodyExpr));
//        }
//        return let;
//    }

//    @Override
//    public ASTNode visitLambda_form(LispParser.Lambda_formContext ctx) {
//        LambdaNode lambda = new LambdaNode();
//        for (LispParser.SymbolAtomContext param : ctx.SYMBOL()) {
//            lambda.parameters.add(param.getText());
//        }
//        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
//            lambda.body.add(visit(bodyExpr));
//        }
//        return lambda;
//    }

    @Override
    public ASTNode visitQuote_form(LispParser.Quote_formContext ctx) {
        return new QuoteNode(visit(ctx.s_expr()));
    }

    @Override
    public ASTNode visitSetq_form(LispParser.Setq_formContext ctx) {
        SetqNode setq = new SetqNode();
        setq.variable = ctx.SYMBOL().getText();
        setq.value = visit(ctx.s_expr());
        return setq;
    }

    @Override
    public ASTNode visitFuncall_form(LispParser.Funcall_formContext ctx) {
        FuncallNode funcall = new FuncallNode();
        funcall.function = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            funcall.arguments.add(visit(ctx.s_expr(i)));
        }
        return funcall;
    }

//    @Override
//    public ASTNode visitCond_form(LispParser.Cond_formContext ctx) {
//        CondNode condNode = new CondNode();
//        for (LispParser.Cond_formContext clauseCtx : ctx.s_expr()) {
//            CondNode.CondClause clause = new CondNode.CondClause();
//            clause.condition = visit(clauseCtx.s_expr(0));
//            for (int i = 1; i < clauseCtx.s_expr().size(); i++) {
//                clause.body.add(visit(clauseCtx.s_expr(i)));
//            }
//            condNode.clauses.add(clause);
//        }
//        return condNode;
//    }

    @Override
    public ASTNode visitWhen_form(LispParser.When_formContext ctx) {
        WhenNode whenNode = new WhenNode();
        whenNode.condition = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            whenNode.body.add(visit(ctx.s_expr(i)));
        }
        return whenNode;
    }

    @Override
    public ASTNode visitUnless_form(LispParser.Unless_formContext ctx) {
        UnlessNode unlessNode = new UnlessNode();
        unlessNode.condition = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            unlessNode.body.add(visit(ctx.s_expr(i)));
        }
        return unlessNode;
    }

    @Override
    public ASTNode visitProgn_form(LispParser.Progn_formContext ctx) {
        PrognNode prognNode = new PrognNode();
        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
            prognNode.body.add(visit(bodyExpr));
        }
        return prognNode;
    }

    @Override
    public ASTNode visitLoop_form(LispParser.Loop_formContext ctx) {
        LoopNode loopNode = new LoopNode();
        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
            loopNode.body.add(visit(bodyExpr));
        }
        return loopNode;
    }

    @Override
    public ASTNode visitReturn_form(LispParser.Return_formContext ctx) {
        ReturnNode returnNode = new ReturnNode();
        if (ctx.s_expr() != null) {
            returnNode.value = visit(ctx.s_expr());
        }
        return returnNode;
    }

//    @Override
//    public ASTNode visitCase_form(LispParser.Case_formContext ctx) {
//        CaseNode caseNode = new CaseNode();
//        caseNode.key = visit(ctx.s_expr(0));
//        for (LispParser.CaseClauseContext clauseCtx : ctx.case_clause()) {
//            CaseNode.CaseClause clause = new CaseNode.CaseClause();
//            clause.condition = visit(clauseCtx.s_expr(0));
//            for (int i = 1; i < clauseCtx.s_expr().size(); i++) {
//                clause.body.add(visit(clauseCtx.s_expr(i)));
//            }
//            caseNode.clauses.add(clause);
//        }
//        return caseNode;
//    }

//    @Override
//    public ASTNode visitOtherwise_form(LispParser.Other_expressionsContext ctx) {
//        OtherwiseNode otherwiseNode = new OtherwiseNode();
//        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
//            otherwiseNode.body.add(visit(bodyExpr));
//        }
//        return otherwiseNode;
//    }

    @Override
    public ASTNode visitEvenp_form(LispParser.Evenp_formContext ctx) {
        EvenpNode evenpNode = new EvenpNode();
        evenpNode.value = visit(ctx.s_expr());
        return evenpNode;
    }

    @Override
    public ASTNode visitOddp_form(LispParser.Oddp_formContext ctx) {
        OddpNode oddpNode = new OddpNode();
        oddpNode.value = visit(ctx.s_expr());
        return oddpNode;
    }

    @Override
    public ASTNode visitMapcar_form(LispParser.Mapcar_formContext ctx) {
        MapcarNode mapcarNode = new MapcarNode();
        mapcarNode.function = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            mapcarNode.arguments.add(visit(ctx.s_expr(i)));
        }
        return mapcarNode;
    }

    @Override
    public ASTNode visitApply_form(LispParser.Apply_formContext ctx) {
        ApplyNode applyNode = new ApplyNode();
        applyNode.function = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            applyNode.arguments.add(visit(ctx.s_expr(i)));
        }
        return applyNode;
    }

    @Override
    public ASTNode visitMember_form(LispParser.Member_formContext ctx) {
        MemberNode memberNode = new MemberNode();
        memberNode.item = visit(ctx.s_expr(0));
        memberNode.list = visit(ctx.s_expr(1));
        return memberNode;
    }

    @Override
    public ASTNode visitAssoc_form(LispParser.Assoc_formContext ctx) {
        AssocNode assocNode = new AssocNode();
        assocNode.key = visit(ctx.s_expr(0));
        assocNode.alist = visit(ctx.s_expr(1));
        return assocNode;
    }

    @Override
    public ASTNode visitRemove_form(LispParser.Remove_formContext ctx) {
        RemoveNode removeNode = new RemoveNode();
        removeNode.item = visit(ctx.s_expr(0));
        removeNode.list = visit(ctx.s_expr(1));
        return removeNode;
    }

    @Override
    public ASTNode visitFind_form(LispParser.Find_formContext ctx) {
        FindNode findNode = new FindNode();
        findNode.item = visit(ctx.s_expr(0));
        findNode.list = visit(ctx.s_expr(1));
        return findNode;
    }

    @Override
    public ASTNode visitPosition_form(LispParser.Position_formContext ctx) {
        PositionNode positionNode = new PositionNode();
        positionNode.item = visit(ctx.s_expr(0));
        positionNode.list = visit(ctx.s_expr(1));
        return positionNode;
    }

    @Override
    public ASTNode visitSubstring_form(LispParser.Substring_formContext ctx) {
        SubstringNode substringNode = new SubstringNode();
        substringNode.string = visit(ctx.s_expr(0));
        substringNode.start = visit(ctx.s_expr(1));
        if (ctx.s_expr().size() > 2) {
            substringNode.end = visit(ctx.s_expr(2));
        }
        return substringNode;
    }

    @Override
    public ASTNode visitConcatenate_form(LispParser.Concatenate_formContext ctx) {
        ConcatenateNode concatenateNode = new ConcatenateNode();
        concatenateNode.type = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            concatenateNode.sequences.add(visit(ctx.s_expr(i)));
        }
        return concatenateNode;
    }

    @Override
    public ASTNode visitChar_form(LispParser.Char_formContext ctx) {
        CharNode charNode = new CharNode();
        charNode.string = visit(ctx.s_expr(0));
        charNode.index = visit(ctx.s_expr(1));
        return charNode;
    }

    @Override
    public ASTNode visitAref_form(LispParser.Aref_formContext ctx) {
        ArefNode arefNode = new ArefNode();
        arefNode.array = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            arefNode.indices.add(visit(ctx.s_expr(i)));
        }
        return arefNode;
    }

    @Override
    public ASTNode visitSort_form(LispParser.Sort_formContext ctx) {
        SortNode sortNode = new SortNode();
        sortNode.sequence = visit(ctx.s_expr(0));
        sortNode.predicate = visit(ctx.s_expr(1));
        return sortNode;
    }

    @Override
    public ASTNode visitMerge_form(LispParser.Merge_formContext ctx) {
        MergeNode mergeNode = new MergeNode();
        mergeNode.type = visit(ctx.s_expr(0));
        mergeNode.sequence1 = visit(ctx.s_expr(1));
        mergeNode.sequence2 = visit(ctx.s_expr(2));
        mergeNode.predicate = visit(ctx.s_expr(3));
        return mergeNode;
    }

    @Override
    public ASTNode visitSubsetp_form(LispParser.Subsetp_formContext ctx) {
        SubsetpNode subsetpNode = new SubsetpNode();
        subsetpNode.list1 = visit(ctx.s_expr(0));
        subsetpNode.list2 = visit(ctx.s_expr(1));
        return subsetpNode;
    }

    @Override
    public ASTNode visitReduce_form(LispParser.Reduce_formContext ctx) {
        ReduceNode reduceNode = new ReduceNode();
        reduceNode.function = visit(ctx.s_expr(0));
        reduceNode.sequence = visit(ctx.s_expr(1));
        return reduceNode;
    }

    @Override
    public ASTNode visitFilter_form(LispParser.Filter_formContext ctx) {
        FilterNode filterNode = new FilterNode();
        filterNode.predicate = visit(ctx.s_expr(0));
        filterNode.sequence = visit(ctx.s_expr(1));
        return filterNode;
    }

    @Override
    public ASTNode visitEvery_form(LispParser.Every_formContext ctx) {
        EveryNode everyNode = new EveryNode();
        everyNode.predicate = visit(ctx.s_expr(0));
        everyNode.sequence = visit(ctx.s_expr(1));
        return everyNode;
    }

    @Override
    public ASTNode visitSome_form(LispParser.Some_formContext ctx) {
        SomeNode someNode = new SomeNode();
        someNode.predicate = visit(ctx.s_expr(0));
        someNode.sequence = visit(ctx.s_expr(1));
        return someNode;
    }

    @Override
    public ASTNode visitNull_form(LispParser.Null_formContext ctx) {
        NullNode nullNode = new NullNode();
        nullNode.value = visit(ctx.s_expr());
        return nullNode;
    }

    @Override
    public ASTNode visitTypeof_form(LispParser.Typeof_formContext ctx) {
        TypeofNode typeofNode = new TypeofNode();
        typeofNode.value = visit(ctx.s_expr());
        return typeofNode;
    }

    @Override
    public ASTNode visitEq_form(LispParser.Eq_formContext ctx) {
        EqNode eqNode = new EqNode();
        eqNode.left = visit(ctx.s_expr(0));
        eqNode.right = visit(ctx.s_expr(1));
        return eqNode;
    }

    @Override
    public ASTNode visitEql_form(LispParser.Eql_formContext ctx) {
        EqlNode eqlNode = new EqlNode();
        eqlNode.left = visit(ctx.s_expr(0));
        eqlNode.right = visit(ctx.s_expr(1));
        return eqlNode;
    }

    @Override
    public ASTNode visitEqualp_form(LispParser.Equalp_formContext ctx) {
        EqualpNode equalpNode = new EqualpNode();
        equalpNode.left = visit(ctx.s_expr(0));
        equalpNode.right = visit(ctx.s_expr(1));
        return equalpNode;
    }

    @Override
    public ASTNode visitTypep_form(LispParser.Typep_formContext ctx) {
        TypepNode typepNode = new TypepNode();
        typepNode.value = visit(ctx.s_expr(0));
        typepNode.type = visit(ctx.s_expr(1));
        return typepNode;
    }

    @Override
    public ASTNode visitSubtypep_form(LispParser.Subtypep_formContext ctx) {
        SubtypepNode subtypepNode = new SubtypepNode();
        subtypepNode.type1 = visit(ctx.s_expr(0));
        subtypepNode.type2 = visit(ctx.s_expr(1));
        return subtypepNode;
    }

    @Override
    public ASTNode visitCoerce_form(LispParser.Coerce_formContext ctx) {
        CoerceNode coerceNode = new CoerceNode();
        coerceNode.value = visit(ctx.s_expr(0));
        coerceNode.type = visit(ctx.s_expr(1));
        return coerceNode;
    }

    @Override
    public ASTNode visitDeclare_form(LispParser.Declare_formContext ctx) {
        DeclareNode declareNode = new DeclareNode();
        for (LispParser.S_exprContext decl : ctx.s_expr()) {
            declareNode.declarations.add(visit(decl));
        }
        return declareNode;
    }

    @Override
    public ASTNode visitThe_form(LispParser.The_formContext ctx) {
        TheNode theNode = new TheNode();
        theNode.type = visit(ctx.s_expr(0));
        theNode.value = visit(ctx.s_expr(1));
        return theNode;
    }

//    @Override
//    public ASTNode visitBlock_form(LispParser.Block_formContext ctx) {
//        BlockNode blockNode = new BlockNode();
//        blockNode.name = ctx.SYMBOL().getText();
//        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
//            blockNode.body.add(visit(bodyExpr));
//        }
//        return blockNode;
//    }

//    @Override
//    public ASTNode visitReturn_from_form(LispParser.Return_from_formContext ctx) {
//        ReturnFromNode returnFromNode = new ReturnFromNode();
//        returnFromNode.blockName = ctx.SYMBOL().getText();
//        if (ctx.s_expr() != null) {
//            returnFromNode.value = visit(ctx.s_expr());
//        }
//        return returnFromNode;
//    }

    @Override
    public ASTNode visitCatch_form(LispParser.Catch_formContext ctx) {
        CatchNode catchNode = new CatchNode();
        catchNode.tag = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            catchNode.body.add(visit(ctx.s_expr(i)));
        }
        return catchNode;
    }

    @Override
    public ASTNode visitThrow_form(LispParser.Throw_formContext ctx) {
        ThrowNode throwNode = new ThrowNode();
        throwNode.tag = visit(ctx.s_expr(0));
        throwNode.result = visit(ctx.s_expr(1));
        return throwNode;
    }

    @Override
    public ASTNode visitTagbody_form(LispParser.Tagbody_formContext ctx) {
        TagbodyNode tagbodyNode = new TagbodyNode();
        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
            tagbodyNode.body.add(visit(bodyExpr));
        }
        return tagbodyNode;
    }

//    @Override
//    public ASTNode visitGo_form(LispParser.Go_formContext ctx) {
//        GoNode goNode = new GoNode();
//        goNode.tag = ctx.SYMBOL().getText();
//        return goNode;
//    }

    @Override
    public ASTNode visitDefclass_form(LispParser.Defclass_formContext ctx) {
        DefclassNode defclassNode = new DefclassNode();
        defclassNode.className = ctx.SYMBOL().getText();
        for (LispParser.S_exprContext superclass : ctx.s_expr()) {
            defclassNode.superclasses.add(visit(superclass));
        }
        for (LispParser.S_exprContext slot : ctx.s_expr()) {
            defclassNode.slots.add(visit(slot));
        }
        return defclassNode;
    }

    @Override
    public ASTNode visitDefmethod_form(LispParser.Defmethod_formContext ctx) {
        DefmethodNode defmethodNode = new DefmethodNode();
        defmethodNode.methodName = ctx.SYMBOL().getText();
        for (LispParser.S_exprContext param : ctx.s_expr()) {
            defmethodNode.parameters.add(visit(param));
        }
        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
            defmethodNode.body.add(visit(bodyExpr));
        }
        return defmethodNode;
    }

    @Override
    public ASTNode visitDefgeneric_form(LispParser.Defgeneric_formContext ctx) {
        DefgenericNode defgenericNode = new DefgenericNode();
        defgenericNode.genericName = ctx.SYMBOL().getText();
        for (LispParser.S_exprContext param : ctx.s_expr()) {
            defgenericNode.parameters.add(visit(param));
        }
        return defgenericNode;
    }

    @Override
    public ASTNode visitIntersection_form(LispParser.Intersection_formContext ctx) {
        IntersectionNode intersectionNode = new IntersectionNode();
        intersectionNode.list1 = visit(ctx.s_expr(0));
        intersectionNode.list2 = visit(ctx.s_expr(1));
        return intersectionNode;
    }

    @Override
    public ASTNode visitUnion_form(LispParser.Union_formContext ctx) {
        UnionNode unionNode = new UnionNode();
        unionNode.list1 = visit(ctx.s_expr(0));
        unionNode.list2 = visit(ctx.s_expr(1));
        return unionNode;
    }

    @Override
    public ASTNode visitSet_difference_form(LispParser.Set_difference_formContext ctx) {
        SetDifferenceNode setDifferenceNode = new SetDifferenceNode();
        setDifferenceNode.list1 = visit(ctx.s_expr(0));
        setDifferenceNode.list2 = visit(ctx.s_expr(1));
        return setDifferenceNode;
    }

    @Override
    public ASTNode visitSignal_form(LispParser.Signal_formContext ctx) {
        SignalNode signalNode = new SignalNode();
        signalNode.condition = visit(ctx.s_expr());
        return signalNode;
    }

    @Override
    public ASTNode visitError_form(LispParser.Error_formContext ctx) {
        ErrorNode errorNode = new ErrorNode();
        errorNode.condition = visit(ctx.s_expr());
        return errorNode;
    }

    @Override
    public ASTNode visitWarn_form(LispParser.Warn_formContext ctx) {
        WarnNode warnNode = new WarnNode();
        warnNode.condition = visit(ctx.s_expr());
        return warnNode;
    }

    @Override
    public ASTNode visitBreak_form(LispParser.Break_formContext ctx) {
        BreakNode breakNode = new BreakNode();
        return breakNode;
    }

    @Override
    public ASTNode visitContinue_form(LispParser.Continue_formContext ctx) {
        ContinueNode continueNode = new ContinueNode();
        return continueNode;
    }

    @Override
    public ASTNode visitStore_value_form(LispParser.Store_value_formContext ctx) {
        StoreValueNode storeValueNode = new StoreValueNode();
        storeValueNode.value = visit(ctx.s_expr());
        return storeValueNode;
    }

    @Override
    public ASTNode visitUse_value_form(LispParser.Use_value_formContext ctx) {
        UseValueNode useValueNode = new UseValueNode();
        useValueNode.value = visit(ctx.s_expr());
        return useValueNode;
    }

    @Override
    public ASTNode visitAbort_form(LispParser.Abort_formContext ctx) {
        AbortNode abortNode = new AbortNode();
        return abortNode;
    }

//    @Override
//    public ASTNode visitTypecase_form(LispParser.Typecase_formContext ctx) {
//        TypecaseNode typecaseNode = new TypecaseNode();
//        typecaseNode.key = visit(ctx.s_expr(0));
//        for (LispParser.TypecaseClauseContext clauseCtx : ctx.typecase_clause()) {
//            TypecaseNode.TypecaseClause clause = new TypecaseNode.TypecaseClause();
//            clause.type = visit(clauseCtx.s_expr(0));
//            for (int i = 1; i < clauseCtx.s_expr().size(); i++) {
//                clause.body.add(visit(clauseCtx.s_expr(i)));
//            }
//            typecaseNode.clauses.add(clause);
//        }
//        return typecaseNode;
//    }

//    @Override
//    public ASTNode visitEtypecase_form(LispParser.Etypecase_formContext ctx) {
//        EtypecaseNode etypecaseNode = new EtypecaseNode();
//        etypecaseNode.key = visit(ctx.s_expr(0));
//        for (LispParser.Typecase_formContext clauseCtx : ctx.typecase_clause()) {
//            EtypecaseNode.TypecaseClause clause = new EtypecaseNode.TypecaseClause();
//            clause.type = visit(clauseCtx.s_expr(0));
//            for (int i = 1; i < clauseCtx.s_expr().size(); i++) {
//                clause.body.add(visit(clauseCtx.s_expr(i)));
//            }
//            etypecaseNode.clauses.add(clause);
//        }
//        return etypecaseNode;
//    }
//
//    @Override
//    public ASTNode visitCtypecase_form(LispParser.Ctypecase_formContext ctx) {
//        CtypecaseNode ctypecaseNode = new CtypecaseNode();
//        ctypecaseNode.key = visit(ctx.s_expr(0));
//        for (LispParser.Typecase_formContext clauseCtx : ctx.typecase_clause()) {
//            CtypecaseNode.TypecaseClause clause = new CtypecaseNode.TypecaseClause();
//            clause.type = visit(clauseCtx.s_expr(0));
//            for (int i = 1; i < clauseCtx.s_expr().size(); i++) {
//                clause.body.add(visit(clauseCtx.s_expr(i)));
//            }
//            ctypecaseNode.clauses.add(clause);
//        }
//        return ctypecaseNode;
//    }

    @Override
    public ASTNode visitProg_form(LispParser.Prog_formContext ctx) {
        ProgNode progNode = new ProgNode();
        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
            progNode.body.add(visit(bodyExpr));
        }
        return progNode;
    }

    @Override
    public ASTNode visitProg1_form(LispParser.Prog1_formContext ctx) {
        Prog1Node prog1Node = new Prog1Node();
        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
            prog1Node.body.add(visit(bodyExpr));
        }
        return prog1Node;
    }

    @Override
    public ASTNode visitProg2_form(LispParser.Prog2_formContext ctx) {
        Prog2Node prog2Node = new Prog2Node();
        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
            prog2Node.body.add(visit(bodyExpr));
        }
        return prog2Node;
    }

    @Override
    public ASTNode visitDo_form(LispParser.Do_formContext ctx) {
        DoNode doNode = new DoNode();
        for (LispParser.S_exprContext binding : ctx.s_expr()) {
            doNode.bindings.add(visit(binding));
        }
        doNode.endTest = visit(ctx.s_expr(ctx.s_expr().size() - 2));
        for (int i = 0; i < ctx.s_expr().size() - 2; i++) {
            doNode.body.add(visit(ctx.s_expr(i)));
        }
        return doNode;
    }

    @Override
    public ASTNode visitDolist_form(LispParser.Dolist_formContext ctx) {
        DolistNode dolistNode = new DolistNode();
        dolistNode.variable = visit(ctx.s_expr(0));
        dolistNode.list = visit(ctx.s_expr(1));
        for (int i = 2; i < ctx.s_expr().size(); i++) {
            dolistNode.body.add(visit(ctx.s_expr(i)));
        }
        return dolistNode;
    }

    @Override
    public ASTNode visitDotimes_form(LispParser.Dotimes_formContext ctx) {
        DotimesNode dotimesNode = new DotimesNode();
        dotimesNode.variable = visit(ctx.s_expr(0));
        dotimesNode.count = visit(ctx.s_expr(1));
        for (int i = 2; i < ctx.s_expr().size(); i++) {
            dotimesNode.body.add(visit(ctx.s_expr(i)));
        }
        return dotimesNode;
    }

    @Override
    public ASTNode visitNext_method_p_form(LispParser.Next_method_p_formContext ctx) {
        NextMethodPNode nextMethodPNode = new NextMethodPNode();
        return nextMethodPNode;
    }

    @Override
    public ASTNode visitPush_form(LispParser.Push_formContext ctx) {
        PushNode pushNode = new PushNode();
        pushNode.item = visit(ctx.s_expr(0));
        pushNode.list = visit(ctx.s_expr(1));
        return pushNode;
    }

    @Override
    public ASTNode visitPop_form(LispParser.Pop_formContext ctx) {
        PopNode popNode = new PopNode();
        popNode.list = visit(ctx.s_expr());
        return popNode;
    }

    @Override
    public ASTNode visitFact_form(LispParser.Fact_formContext ctx) {
        FactNode factNode = new FactNode();
        factNode.value = visit(ctx.s_expr());
        return factNode;
    }

    @Override
    public ASTNode visitOptional_form(LispParser.Optional_formContext ctx) {
        OptionalNode optionalNode = new OptionalNode();
        for (LispParser.S_exprContext param : ctx.s_expr()) {
            optionalNode.parameters.add(visit(param));
        }
        return optionalNode;
    }

    @Override
    public ASTNode visitReset_form(LispParser.Reset_formContext ctx) {
        ResetNode resetNode = new ResetNode();
        for (LispParser.S_exprContext param : ctx.s_expr()) {
            resetNode.parameters.add(visit(param));
        }
        return resetNode;
    }

    @Override
    public ASTNode visitKey_form(LispParser.Key_formContext ctx) {
        KeyNode keyNode = new KeyNode();
        for (LispParser.S_exprContext param : ctx.s_expr()) {
            keyNode.parameters.add(visit(param));
        }
        return keyNode;
    }

    @Override
    public ASTNode visitMake_array_form(LispParser.Make_array_formContext ctx) {
        MakeArrayNode makeArrayNode = new MakeArrayNode();
        makeArrayNode.dimensions = visit(ctx.s_expr(0));
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            makeArrayNode.initialContents.add(visit(ctx.s_expr(i)));
        }
        return makeArrayNode;
    }

    @Override
    public ASTNode visitDefstruct_form(LispParser.Defstruct_formContext ctx) {
        DefstructNode defstructNode = new DefstructNode();
        defstructNode.structName = ctx.SYMBOL().getText();
        for (LispParser.S_exprContext slot : ctx.s_expr()) {
            defstructNode.slots.add(visit(slot));
        }
        return defstructNode;
    }

    @Override
    public ASTNode visitSetf_form(LispParser.Setf_formContext ctx) {
        SetfNode setfNode = new SetfNode();
        setfNode.place = visit(ctx.s_expr(0));
        setfNode.value = visit(ctx.s_expr(1));
        return setfNode;
    }

    @Override
    public ASTNode visitIncf_form(LispParser.Incf_formContext ctx) {
        IncfNode incfNode = new IncfNode();
        incfNode.place = visit(ctx.s_expr(0));
        if (ctx.s_expr().size() > 1) {
            incfNode.delta = visit(ctx.s_expr(1));
        }
        return incfNode;
    }
}