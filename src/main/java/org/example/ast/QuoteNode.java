package org.example.ast;

// File: src/main/java/com/yourdomain/ast/QuoteNode.java

public class QuoteNode extends ASTNode {
    public ASTNode quotedExpression;

    public QuoteNode(ASTNode quotedExpression) {
        this.quotedExpression = quotedExpression;
    }

    @Override
    public String toString() {
        return "\nQuoteNode{" +
                "quotedExpression=" + quotedExpression +
                '}'+ "\n";
    }
}
