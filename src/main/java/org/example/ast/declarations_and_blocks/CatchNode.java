package org.example.ast.declarations_and_blocks;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CatchNode extends ASTNode {
    public ASTNode tag;
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nCatchNode{" +
                "tag=" + tag +
                ", body=" + body +
                '}' + "\n";
    }
}
