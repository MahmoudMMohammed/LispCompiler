package org.example.ast.special_forms;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class WhenNode extends ASTNode {
    public ASTNode condition;
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nWhenNode{" +
                "condition=" + condition +
                ", body=" + body +
                '}' + "\n";
    }
}
