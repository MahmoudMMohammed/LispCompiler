package org.example.AST;

public class PrintExprNode extends OtherExpressionsNode {
    private ASTNode expression;

    public PrintExprNode(ASTNode expression) {
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }
}
