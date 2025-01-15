package org.example.ast.type_predicates_and_operations;

import org.example.ast.ASTNode;

public class TypepNode extends ASTNode {
    public ASTNode value;
    public ASTNode type;

    @Override
    public String toString() {
        return "\nTypepNode{" +
                "value=" + value +
                ", type=" + type +
                '}' + "\n";
    }
}
