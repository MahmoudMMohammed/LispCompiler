package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class FindNode extends ASTNode {
    public ASTNode item;
    public ASTNode list;

    @Override
    public String toString() {
        return "\nFindNode{" +
                "item=" + item +
                ", list=" + list +
                '}' + "\n";
    }
}
