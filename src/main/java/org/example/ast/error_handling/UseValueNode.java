package org.example.ast.error_handling;

import org.example.ast.ASTNode;

public class UseValueNode extends ASTNode {
    public ASTNode value;

    @Override
    public String toString() {
        return "\nUseValueNode{" +
                "value=" + value +
                '}' + "\n";
    }
}
