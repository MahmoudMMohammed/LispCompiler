package org.example.ast.oop;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class DefclassNode extends ASTNode {
    public String className;
    public List<ASTNode> superclasses = new ArrayList<>();
    public List<ASTNode> slots = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDefclassNode{" +
                "className='" + className + '\'' +
                ", superclasses=" + superclasses +
                ", slots=" + slots +
                '}' + "\n";
    }
}
