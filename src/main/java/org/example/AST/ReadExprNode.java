package org.example.AST;

public class ReadExprNode extends OtherExpressionsNode {
    private ASTNode source;

    public ReadExprNode(ASTNode source) {
        this.source = source;
    }

    public ASTNode getSource() {
        return source;
    }
}
