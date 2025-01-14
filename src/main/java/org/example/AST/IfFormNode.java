package org.example.AST;

public class IfFormNode extends SpecialFormNode {
    private ASTNode condition;
    private ASTNode trueBranch;
    private ASTNode falseBranch;

    public IfFormNode(ASTNode condition, ASTNode trueBranch, ASTNode falseBranch) {
        this.condition = condition;
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public ASTNode getTrueBranch() {
        return trueBranch;
    }

    public ASTNode getFalseBranch() {
        return falseBranch;
    }
}
