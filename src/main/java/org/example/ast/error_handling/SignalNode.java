package org.example.ast.error_handling;

import org.example.ast.ASTNode;

public class SignalNode extends ASTNode {
    public ASTNode condition;

    @Override
    public String toString() {
        return "\nSignalNode{" +
                "condition=" + condition +
                '}' + "\n";
    }
}
