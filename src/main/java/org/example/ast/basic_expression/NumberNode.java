package org.example.ast.basic_expression;

// File: src/main/java/com/yourdomain/ast/NumberNode.java

import org.example.ast.ASTNode; public class NumberNode extends ASTNode {
    public String value; // Keeping as String to preserve format (e.g., "42", "3.14", "1e10")

    public NumberNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nNumberNode{" +
                "value='" + value + '\'' +
                '}';
    }
}
