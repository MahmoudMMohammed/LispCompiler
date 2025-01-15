package org.example.ast.predicates;

import org.example.ast.ASTNode;

public class OddpNode extends ASTNode {
    public ASTNode value;

    @Override
    public String toString() {
        return "\nOddpNode{" +
                "value=" + value +
                '}' + "\n";
    }
}
