package org.example.ast.predicates;

import org.example.ast.ASTNode;

public class EvenpNode extends ASTNode {
    public ASTNode value;

    @Override
    public String toString() {
        return "\nEvenpNode{" +
                "value=" + value +
                '}' + "\n";
    }
}
