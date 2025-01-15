package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class MapcarNode extends ASTNode {
    public ASTNode function;
    public List<ASTNode> arguments = new ArrayList<>();

    @Override
    public String toString() {
        return "\nMapcarNode{" +
                "function=" + function +
                ", arguments=" + arguments +
                '}' + "\n";
    }
}
