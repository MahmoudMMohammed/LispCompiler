package org.example.ast.declarations_and_blocks;

import org.example.ast.ASTNode;

public class ReturnFromNode extends ASTNode {
    public String blockName;
    public ASTNode value;

    @Override
    public String toString() {
        return "\nReturnFromNode{" +
                "blockName='" + blockName + '\'' +
                ", value=" + value +
                '}' + "\n";
    }
}
