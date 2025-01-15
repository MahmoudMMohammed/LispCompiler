package org.example.ast.miscellaneous;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class MakeArrayNode extends ASTNode {
    public ASTNode dimensions;
    public List<ASTNode> initialContents = new ArrayList<>();

    @Override
    public String toString() {
        return "\nMakeArrayNode{" +
                "dimensions=" + dimensions +
                ", initialContents=" + initialContents +
                '}' + "\n";
    }
}
