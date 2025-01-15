package org.example.ast.error_handling;

import org.example.ast.ASTNode;

public class WarnNode extends ASTNode {
    public ASTNode condition;

    @Override
    public String toString() {
        return "\nWarnNode{" +
                "condition=" + condition +
                '}' + "\n";
    }
}
