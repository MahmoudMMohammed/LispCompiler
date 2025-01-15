package org.example.ast.program_constructs;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class DoNode extends ASTNode {
    public List<ASTNode> bindings = new ArrayList<>();
    public ASTNode endTest;
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDoNode{" +
                "bindings=" + bindings +
                ", endTest=" + endTest +
                ", body=" + body +
                '}' + "\n";
    }
}
