package org.example.ast.type_predicates_and_operations;

import org.example.ast.ASTNode;

public class CoerceNode extends ASTNode {
    public ASTNode value;
    public ASTNode type;

    @Override
    public String toString() {
        return "\nCoerceNode{" +
                "value=" + value +
                ", type=" + type +
                '}' + "\n";
    }
}
