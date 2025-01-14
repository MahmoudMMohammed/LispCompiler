package org.example.AST;

public class EvalExprNode extends OtherExpressionsNode {
    private ASTNode expression;

    public EvalExprNode(ASTNode expression) {
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }
}
