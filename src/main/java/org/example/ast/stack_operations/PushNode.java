package org.example.ast.stack_operations;

import org.example.ast.ASTNode;

public class PushNode extends ASTNode {
    public ASTNode item;
    public ASTNode list;

    @Override
    public String toString() {
        return "\nPushNode{" +
                "item=" + item +
                ", list=" + list +
                '}' + "\n";
    }
}
