package org.example.AST;

import java.util.List;

public class ListNode extends ASTNode {
    private List<ASTNode> elements; // List of AST nodes

    public ListNode(List<ASTNode> elements) {
        this.elements = elements;
    }

    public List<ASTNode> getElements() {
        return elements;
    }
}