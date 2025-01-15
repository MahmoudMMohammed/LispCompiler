package org.example.ast.program_constructs;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends ASTNode {
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nProgNode{" +
                "body=" + body +
                '}' + "\n";
    }
}
