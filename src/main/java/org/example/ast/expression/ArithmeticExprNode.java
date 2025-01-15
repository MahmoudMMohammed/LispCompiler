package org.example.ast.expression;

// File: src/main/java/com/yourdomain/ast/ArithmeticExprNode.java

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticExprNode extends ASTNode {
    public String operator; // e.g., "+", "-", "*", "/"
    public List<ASTNode> operands = new ArrayList<>();

    @Override
    public String toString() {
        return "\nArithmeticExprNode{" +
                "operator='" + operator + '\'' +
                ", operands=" + operands +
                '}'+ "\n";
    }
}
