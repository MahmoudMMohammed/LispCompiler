package org.example.ast.expression;

// File: src/main/java/com/yourdomain/ast/ListOperationNode.java

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ListOperationNode extends ASTNode {
    public String operation; // e.g., "car", "cdr", "cons", etc.
    public List<ASTNode> arguments = new ArrayList<>();

    @Override
    public String toString() {
        return "\nListOperationNode{" +
                "operation='" + operation + '\'' +
                ", arguments=" + arguments +
                '}'+ "\n";
    }
}
