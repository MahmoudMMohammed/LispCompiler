package org.example.ast.declarations_and_blocks;

import org.example.ast.ASTNode;

public class GoNode extends ASTNode {
    public String tag;

    @Override
    public String toString() {
        return "\nGoNode{" +
                "tag='" + tag + '\'' +
                '}' + "\n";
    }
}
