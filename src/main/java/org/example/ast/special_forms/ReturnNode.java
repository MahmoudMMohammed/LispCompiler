package org.example.ast.special_forms;

import org.example.ast.ASTNode;

public class ReturnNode extends ASTNode {
    public ASTNode value;

    @Override
    public String toString() {
        return "\nReturnNode{" +
                "value=" + value +
                '}' + "\n";
    }
}
