package org.example.ast.stack_operations;

import org.example.ast.ASTNode;

public class PopNode extends ASTNode {
    public ASTNode list;

    @Override
    public String toString() {
        return "\nPopNode{" +
                "list=" + list +
                '}' + "\n";
    }
}
