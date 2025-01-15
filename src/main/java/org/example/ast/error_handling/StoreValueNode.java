package org.example.ast.error_handling;

import org.example.ast.ASTNode;

public class StoreValueNode extends ASTNode {
    public ASTNode value;

    @Override
    public String toString() {
        return "\nStoreValueNode{" +
                "value=" + value +
                '}' + "\n";
    }
}
