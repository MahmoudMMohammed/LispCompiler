package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class AssocNode extends ASTNode {
    public ASTNode key;
    public ASTNode alist;

    @Override
    public String toString() {
        return "\nAssocNode{" +
                "key=" + key +
                ", alist=" + alist +
                '}' + "\n";
    }
}
