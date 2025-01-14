package org.example.AST;

import java.util.List;

public class ListOperationNode extends ASTNode {
    private String operation;
    private List<ASTNode> operands;

    public ListOperationNode(String operation, List<ASTNode> operands) {
        this.operation = operation;
        this.operands = operands;
    }

    public String getOperation() {
        return operation;
    }

    public List<ASTNode> getOperands() {
        return operands;
    }
}