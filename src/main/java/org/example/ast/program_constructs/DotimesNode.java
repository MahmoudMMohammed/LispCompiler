package org.example.ast.program_constructs;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class DotimesNode extends ASTNode {
    public ASTNode variable;
    public ASTNode count;
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDotimesNode{" +
                "variable=" + variable +
                ", count=" + count +
                ", body=" + body +
                '}' + "\n";
    }
}
