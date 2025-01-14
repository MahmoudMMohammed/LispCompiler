package org.example.AST;

public class SExprNode extends ASTNode {
    private ASTNode value; // Can be AtomNode, ListNode, or others

    public SExprNode(ASTNode value) {
        this.value = value;
    }

    public ASTNode getValue() {
        return value;
    }
}
