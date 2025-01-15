package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class SortNode extends ASTNode {
    public ASTNode sequence;
    public ASTNode predicate;

    @Override
    public String toString() {
        return "\nSortNode{" +
                "sequence=" + sequence +
                ", predicate=" + predicate +
                '}' + "\n";
    }
}
