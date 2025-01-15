package org.example.ast.expression;

// File: src/main/java/com/yourdomain/ast/LogicalExprNode.java

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class LogicalExprNode extends ASTNode {
    public String operator; // e.g., "and", "or", "not"
    public List<ASTNode> operands = new ArrayList<>();

    @Override
    public String toString() {
        return "\nLogicalExprNode{" +
                "operator='" + operator + '\'' +
                ", operands=" + operands +
                '}'+ "\n";
    }
}
