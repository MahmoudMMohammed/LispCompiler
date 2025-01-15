package org.example.ast.oop;


import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class DefgenericNode extends ASTNode {
    public String genericName;
    public List<ASTNode> parameters = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDefgenericNode{" +
                "genericName='" + genericName + '\'' +
                ", parameters=" + parameters +
                '}' + "\n";
    }
}
