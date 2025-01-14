package org.example.AST;

public class QuoteFormNode extends SpecialFormNode {
    private ASTNode quotedExpression;

    public QuoteFormNode(ASTNode quotedExpression) {
        this.quotedExpression = quotedExpression;
    }

    public ASTNode getQuotedExpression() {
        return quotedExpression;
    }
}
