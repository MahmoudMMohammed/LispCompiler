package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class SubsetpNode extends ASTNode {
    public ASTNode list1;
    public ASTNode list2;

    @Override
    public String toString() {
        return "\nSubsetpNode{" +
                "list1=" + list1 +
                ", list2=" + list2 +
                '}' + "\n";
    }
}
