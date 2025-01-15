package org.example.ast.declarations_and_blocks;

import org.example.ast.ASTNode;

public class TheNode extends ASTNode {
    public ASTNode type;
    public ASTNode value;

    @Override
    public String toString() {
        return "\nTheNode{" +
                "type=" + type +
                ", value=" + value +
                '}' + "\n";
    }
}
