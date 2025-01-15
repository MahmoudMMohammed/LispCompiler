package org.example.ast.declarations_and_blocks;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class DeclareNode extends ASTNode {
    public List<ASTNode> declarations = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDeclareNode{" +
                "declarations=" + declarations +
                '}' + "\n";
    }
}
