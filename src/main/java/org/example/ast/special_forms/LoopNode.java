package org.example.ast.special_forms;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class LoopNode extends ASTNode {
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nLoopNode{" +
                "body=" + body +
                '}' + "\n";
    }
}