package org.example.ast.expression;

// File: src/main/java/com/yourdomain/ast/OtherExprNode.java

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class OtherExprNode extends ASTNode {
    public String operation; // e.g., "print", "eval", "format", etc.
    public List<ASTNode> arguments = new ArrayList<>();

    @Override
    public String toString() {
        return "\nOtherExprNode{" +
                "operation='" + operation + '\'' +
                ", arguments=" + arguments +
                '}'+ "\n";
    }
}
