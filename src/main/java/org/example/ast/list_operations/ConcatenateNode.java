package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateNode extends ASTNode {
    public ASTNode type;
    public List<ASTNode> sequences = new ArrayList<>();

    @Override
    public String toString() {
        return "\nConcatenateNode{" +
                "type=" + type +
                ", sequences=" + sequences +
                '}' + "\n";
    }
}
