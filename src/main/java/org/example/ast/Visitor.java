package org.example.ast;

import org.example.LispParser;
import org.example.LispParserBaseVisitor;
import org.example.ast.basic_expression.NumberNode;
import org.example.ast.basic_expression.StringNode;
import org.example.ast.basic_expression.SymbolNode;
import org.example.ast.expression.*;

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
    public ASTNode visitIf_form(LispParser.If_formContext ctx) {
        return null;
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

    @Override
    public ASTNode visitEval_expr(LispParser.Eval_exprContext ctx) {
        return null;
    }


    @Override
    public ASTNode visitOther_expressions(LispParser.Other_expressionsContext ctx) {
        if (ctx.print_expr() != null) {
            return visitPrint_expr(ctx.print_expr());
        } else if (ctx.eval_expr() != null) {
            return visitEval_expr(ctx.eval_expr());
        } else if (ctx.load_expr() != null) {
            return visitLoad_expr(ctx.load_expr());
        } else if (ctx.read_expr() != null) {
            return visitRead_expr(ctx.read_expr());
        }
        return null;
    }

    @Override
    public ASTNode visitLoad_expr(LispParser.Load_exprContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitRead_expr(LispParser.Read_exprContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDefunForm(LispParser.Defun_formContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDefparameterForm(LispParser.Defparameter_formContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitLetForm(LispParser.Let_formContext ctx) {
        return null;
    }




//    @Override
//    public ASTNode visitLoad_expr(LispParser.Load_exprContext ctx) {
//        OtherExprNode loadExpr = new OtherExprNode();
//        loadExpr.operation = "load";
//        loadExpr.arguments.add(new StringNode(ctx.STRING_WITH_DIRECTIVES().getText()));
//        return loadExpr;
//    }
//
//    @Override
//    public ASTNode visitRead_expr(LispParser.Read_exprContext ctx) {
//        OtherExprNode readExpr = new OtherExprNode();
//        readExpr.operation = "read";
//        return readExpr;
//    }
//
//    @Override
//    public ASTNode visitDefunForm(LispParser.DefunFormContext ctx) {
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
//
//    @Override
//    public ASTNode visitDefparameterForm(LispParser.DefparameterFormContext ctx) {
//        DefparameterNode defparameter = new DefparameterNode();
//        defparameter.name = ctx.SYMBOL().getText();
//        defparameter.value = visit(ctx.s_expr());
//        return defparameter;
//    }
//
//    @Override
//    public ASTNode visitLetForm(LispParser.LetFormContext ctx) {
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
//
//    @Override
//    public ASTNode visitLambdaForm(LispParser.LambdaFormContext ctx) {
//        LambdaNode lambda = new LambdaNode();
//        for (LispParser.SymbolAtomContext param : ctx.SYMBOL()) {
//            lambda.parameters.add(param.getText());
//        }
//        for (LispParser.S_exprContext bodyExpr : ctx.s_expr()) {
//            lambda.body.add(visit(bodyExpr));
//        }
//        return lambda;
//    }
//
//    @Override
//    public ASTNode visitQuoteForm(LispParser.QuoteFormContext ctx) {
//        return new QuoteNode(visit(ctx.s_expr()));
//    }
//
//    @Override
//    public ASTNode visitSetqForm(LispParser.SetqFormContext ctx) {
//        SetqNode setq = new SetqNode();
//        setq.variable = ctx.SYMBOL().getText();
//        setq.value = visit(ctx.s_expr());
//        return setq;
//    }
//
//    @Override
//    public ASTNode visitFuncallForm(LispParser.FuncallFormContext ctx) {
//        FuncallNode funcall = new FuncallNode();
//        funcall.function = visit(ctx.s_expr(0));
//        for (int i = 1; i < ctx.s_expr().size(); i++) {
//            funcall.arguments.add(visit(ctx.s_expr(i)));
//        }
//        return funcall;
//    }
//
//    @Override
//    public ASTNode visitIfForm(LispParser.IfFormContext ctx) {
//        IfNode ifNode = new IfNode();
//        ifNode.condition = visit(ctx.s_expr(0));
//        ifNode.thenBranch = visit(ctx.s_expr(1));
//        if (ctx.s_expr().size() > 2) {
//            ifNode.elseBranch = visit(ctx.s_expr(2));
//        }
//        return ifNode;
//    }
}
