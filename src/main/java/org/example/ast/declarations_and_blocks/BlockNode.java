package org.example.ast.declarations_and_blocks;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class BlockNode extends ASTNode {
    public String name;
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nBlockNode{" +
                "name='" + name + '\'' +
                ", body=" + body +
                '}' + "\n";
    }
}
