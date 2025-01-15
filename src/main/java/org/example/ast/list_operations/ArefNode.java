package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ArefNode extends ASTNode {
    public ASTNode array;
    public List<ASTNode> indices = new ArrayList<>();

    @Override
    public String toString() {
        return "\nArefNode{" +
                "array=" + array +
                ", indices=" + indices +
                '}' + "\n";
    }
}
