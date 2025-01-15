package org.example.ast.declarations_and_blocks;

import org.example.ast.ASTNode;

public class ThrowNode extends ASTNode {
    public ASTNode tag;
    public ASTNode result;

    @Override
    public String toString() {
        return "\nThrowNode{" +
                "tag=" + tag +
                ", result=" + result +
                '}' + "\n";
    }
}
