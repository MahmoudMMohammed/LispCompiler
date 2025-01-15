package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class EveryNode extends ASTNode {
    public ASTNode predicate;
    public ASTNode sequence;

    @Override
    public String toString() {
        return "\nEveryNode{" +
                "predicate=" + predicate +
                ", sequence=" + sequence +
                '}' + "\n";
    }
}
