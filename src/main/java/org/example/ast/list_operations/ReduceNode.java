package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ReduceNode extends ASTNode {
    public ASTNode function;
    public ASTNode sequence;

    @Override
    public String toString() {
        return "\nReduceNode{" +
                "function=" + function +
                ", sequence=" + sequence +
                '}' + "\n";
    }
}
