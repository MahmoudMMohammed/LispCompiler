package org.example.ast;


import java.util.ArrayList;
import java.util.List;

public class ListNode extends ASTNode {
    public List<ASTNode> elements = new ArrayList<>();

    @Override
    public String toString() {
        return "\nListNode{" +
                "elements=" + elements +
                '}'+ "\n";
    }
}
