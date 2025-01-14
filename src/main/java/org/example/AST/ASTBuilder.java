package org.example.AST;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.example.LispParser;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ASTBuilder {
    private LispParser parser;

    public ASTBuilder(LispParser parser) {
        this.parser = parser;
    }

    public ASTNode build(ParseTree tree) {
        if (tree instanceof LispParser.S_exprContext) {
            return visitSExpr((LispParser.S_exprContext) tree);
        } else if (tree instanceof LispParser.AtomContext) {
            return visitAtom((LispParser.AtomContext) tree);
        } else if (tree instanceof LispParser.ListContext) {
            return visitList((LispParser.ListContext) tree);
        } else if (tree instanceof LispParser.Function_callContext) {
            return visitFunctionCall((LispParser.Function_callContext) tree);
        } else if (tree instanceof LispParser.Special_formContext) {
            return visitSpecialForm((LispParser.Special_formContext) tree);
        }
        throw new UnsupportedOperationException("Unhandled ParseTree type: " + tree.getClass().getName());
    }

    public ASTNode visit(ParseTree tree) {
        if (tree instanceof LispParser.S_exprContext) {
            return visitSExpr((LispParser.S_exprContext) tree);
        } else if (tree instanceof LispParser.AtomContext) {
            return visitAtom((LispParser.AtomContext) tree);
        } else if (tree instanceof LispParser.ListContext) {
            return visitList((LispParser.ListContext) tree);
        } else if (tree instanceof LispParser.Function_callContext) {
            return visitFunctionCall((LispParser.Function_callContext) tree);
        } else if (tree instanceof LispParser.Special_formContext) {
            return visitSpecialForm((LispParser.Special_formContext) tree);
        }
        throw new UnsupportedOperationException("Unhandled ParseTree type: " + tree.getClass().getName());
    }

    private ASTNode visitSExpr(LispParser.S_exprContext ctx) {
        if (ctx.atom() != null) {
            return visitAtom(ctx.atom());
        } else if (ctx.list() != null) {
            return visitList(ctx.list());
        }
        throw new IllegalArgumentException("Invalid S-expression");
    }

    private AtomNode visitAtom(LispParser.AtomContext ctx) {
        return new AtomNode(ctx.getText());
    }

    private ListNode visitList(LispParser.ListContext ctx) {
        List<ASTNode> elements = new ArrayList<>();
        for (LispParser.S_exprContext elementCtx : ctx.s_expr()) {
            elements.add(visitSExpr(elementCtx));
        }
        return new ListNode(elements);
    }

    private FunctionCallNode visitFunctionCall(LispParser.Function_callContext ctx) {
        String functionName = ctx.SYMBOL().getText();
        List<ASTNode> arguments = new ArrayList<>();
        for (LispParser.S_exprContext argCtx : ctx.s_expr()) {
            arguments.add(visitSExpr(argCtx));
        }
        return new FunctionCallNode(functionName, arguments);
    }

    private ASTNode visitSpecialForm(LispParser.Special_formContext ctx) {
        if (ctx.if_form() != null) {
            return visitIfForm(ctx.if_form());
        } else if (ctx.defun_form() != null) {
            return visitDefunForm(ctx.defun_form());
        } else if (ctx.defparameter_form() != null) {
            return visitDefparameterForm(ctx.defparameter_form());
//        } else if (ctx.let_form() != null) {
//            return visitLetForm(ctx.let_form());
        } else if (ctx.lambda_form() != null) {
            return visitLambdaForm(ctx.lambda_form());
        } else if (ctx.quote_form() != null) {
            return visitQuoteForm(ctx.quote_form());
        } else if (ctx.setq_form() != null) {
            return visitSetqForm(ctx.setq_form());
        } else if (ctx.funcall_form() != null) {
            return visitFuncallForm(ctx.funcall_form());
        }
        throw new IllegalArgumentException("Invalid special form");
    }

    private IfFormNode visitIfForm(LispParser.If_formContext ctx) {
        ASTNode condition = visitSExpr(ctx.s_expr(0));
        ASTNode trueBranch = visitSExpr(ctx.s_expr(1));
        ASTNode falseBranch = visitSExpr(ctx.s_expr(2));
        return new IfFormNode(condition, trueBranch, falseBranch);
    }

    private DefunFormNode visitDefunForm(LispParser.Defun_formContext ctx) {
        String functionName = ctx.DEFUN().getText();
        List<String> parameters = new ArrayList<>();
        for (LispParser.S_exprContext param : ctx.s_expr()) {
            parameters.add(param.getText());
        }
        ASTNode body = visitSExpr((LispParser.S_exprContext) ctx.s_expr());
        return new DefunFormNode(functionName, parameters, body);
    }

    private DefparameterFormNode visitDefparameterForm(LispParser.Defparameter_formContext ctx) {
        String parameterName = ctx.DEFPARAMETER().getText();
        ASTNode value = visitSExpr(ctx.s_expr());
        return new DefparameterFormNode(parameterName, value);
    }

//    private LetFormNode visitLetForm(LispParser.Let_formContext ctx) {
//        List<Map.Entry<String, ASTNode>> bindings = new ArrayList<>();
//        for (LispParser.S_exprContext bindingCtx : ctx.s_expr()) {
//            String varName = bindingCtx.getText();
//            ASTNode value = visitSExpr(bindingCtx.getText());
//            bindings.add(new AbstractMap.SimpleEntry<>(varName, value));
//        }
//        ASTNode body = visitSExpr(ctx.s_expr());
//        return new LetFormNode(bindings, body);
//    }

    private LambdaFormNode visitLambdaForm(LispParser.Lambda_formContext ctx) {
        List<String> parameters = new ArrayList<>();
        for (LispParser.S_exprContext param : ctx.s_expr()) {
            parameters.add(param.getText());
        }
        ASTNode body = visitSExpr((LispParser.S_exprContext) ctx.s_expr());
        return new LambdaFormNode(parameters, body);
    }

    private QuoteFormNode visitQuoteForm(LispParser.Quote_formContext ctx) {
        ASTNode quotedExpression = visitSExpr(ctx.s_expr());
        return new QuoteFormNode(quotedExpression);
    }

    private SetqFormNode visitSetqForm(LispParser.Setq_formContext ctx) {
        String variableName = ctx.SETQ().getText();
        ASTNode value = visitSExpr(ctx.s_expr());
        return new SetqFormNode(variableName, value);
    }

    private FuncallFormNode visitFuncallForm(LispParser.Funcall_formContext ctx) {
        ASTNode function = visitSExpr(ctx.s_expr(0));
        List<ASTNode> arguments = new ArrayList<>();
        for (int i = 1; i < ctx.s_expr().size(); i++) {
            arguments.add(visitSExpr(ctx.s_expr(i)));
        }
        return new FuncallFormNode(function, arguments);
    }
}
