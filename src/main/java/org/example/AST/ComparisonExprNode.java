package org.example.AST;

import java.util.List;

public class ComparisonExprNode extends ASTNode {
    private String operator;
    private List<ASTNode> operands;

    public ComparisonExprNode(String operator, List<ASTNode> operands) {
        this.operator = operator;
        this.operands = operands;
    }

    public String getOperator() {
        return operator;
    }

    public List<ASTNode> getOperands() {
        return operands;
    }
}
