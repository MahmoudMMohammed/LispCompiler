package org.example.ast.miscellaneous;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class DefstructNode extends ASTNode {
    public String structName;
    public List<ASTNode> slots = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDefstructNode{" +
                "structName='" + structName + '\'' +
                ", slots=" + slots +
                '}' + "\n";
    }
}
