package org.example.ast.program_constructs;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class DolistNode extends ASTNode {
    public ASTNode variable;
    public ASTNode list;
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDolistNode{" +
                "variable=" + variable +
                ", list=" + list +
                ", body=" + body +
                '}' + "\n";
    }
}
