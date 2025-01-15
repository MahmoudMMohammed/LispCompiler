package org.example.ast.type_predicates_and_operations;

import org.example.ast.ASTNode;

public class TypeofNode extends ASTNode {
    public ASTNode value;

    @Override
    public String toString() {
        return "\nTypeofNode{" +
                "value=" + value +
                '}' + "\n";
    }
}
