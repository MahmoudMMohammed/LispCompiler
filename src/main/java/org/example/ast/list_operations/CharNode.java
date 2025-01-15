package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CharNode extends ASTNode {
    public ASTNode string;
    public ASTNode index;

    @Override
    public String toString() {
        return "\nCharNode{" +
                "string=" + string +
                ", index=" + index +
                '}' + "\n";
    }
}
