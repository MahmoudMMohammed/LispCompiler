package org.example.ast.error_handling;

import org.example.ast.ASTNode;

public class ErrorNode extends ASTNode {
    public ASTNode condition;

    @Override
    public String toString() {
        return "\nErrorNode{" +
                "condition=" + condition +
                '}' + "\n";
    }
}
