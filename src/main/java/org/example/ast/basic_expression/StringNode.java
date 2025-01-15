package org.example.ast.basic_expression;

// File: src/main/java/com/yourdomain/ast/StringNode.java

import org.example.ast.ASTNode;

public class StringNode extends ASTNode {
    public String value;

    public StringNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nStringNode{" +
                "value='" + value + '\'' +
                '}'+ "\n";
    }
}

