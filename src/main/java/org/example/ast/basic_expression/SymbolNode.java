package org.example.ast.basic_expression;
// File: src/main/java/com/yourdomain/ast/SymbolNode.java

import org.example.ast.ASTNode;

public class SymbolNode extends ASTNode {
    public String name;

    public SymbolNode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nSymbolNode{" +
                "name='" + name + '\'' +
                '}'+ "\n";
    }
}

