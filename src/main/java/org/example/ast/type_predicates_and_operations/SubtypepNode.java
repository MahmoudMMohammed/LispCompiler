package org.example.ast.type_predicates_and_operations;

import org.example.ast.ASTNode;

public class SubtypepNode extends ASTNode {
    public ASTNode type1;
    public ASTNode type2;

    @Override
    public String toString() {
        return "\nSubtypepNode{" +
                "type1=" + type1 +
                ", type2=" + type2 +
                '}' + "\n";
    }
}
