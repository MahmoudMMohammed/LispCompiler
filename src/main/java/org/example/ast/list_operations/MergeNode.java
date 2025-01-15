package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class MergeNode extends ASTNode {
    public ASTNode type;
    public ASTNode sequence1;
    public ASTNode sequence2;
    public ASTNode predicate;

    @Override
    public String toString() {
        return "\nMergeNode{" +
                "type=" + type +
                ", sequence1=" + sequence1 +
                ", sequence2=" + sequence2 +
                ", predicate=" + predicate +
                '}' + "\n";
    }
}
