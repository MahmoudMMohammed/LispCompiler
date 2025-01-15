package org.example.ast.type_predicates_and_operations;

import org.example.ast.ASTNode;

public class EqualpNode extends ASTNode {
    public ASTNode left;
    public ASTNode right;

    @Override
    public String toString() {
        return "\nEqualpNode{" +
                "left=" + left +
                ", right=" + right +
                '}' + "\n";
    }
}