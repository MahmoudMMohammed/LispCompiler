package org.example.ast.set_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class SetDifferenceNode extends ASTNode {
    public ASTNode list1;
    public ASTNode list2;

    @Override
    public String toString() {
        return "\nSetDifferenceNode{" +
                "list1=" + list1 +
                ", list2=" + list2 +
                '}' + "\n";
    }
}
