package org.example.ast.list_operations;

import org.example.ast.ASTNode;

public class NullNode extends ASTNode {
    public ASTNode value;

    @Override
    public String toString() {
        return "\nNullNode{" +
                "value=" + value +
                '}' + "\n";
    }
}
