package org.example.ast.declarations_and_blocks;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class TagbodyNode extends ASTNode {
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nTagbodyNode{" +
                "body=" + body +
                '}' + "\n";
    }
}
