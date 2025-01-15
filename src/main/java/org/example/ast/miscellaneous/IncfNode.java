package org.example.ast.miscellaneous;

import org.example.ast.ASTNode;

public class IncfNode extends ASTNode {
    public ASTNode place;
    public ASTNode delta;

    @Override
    public String toString() {
        return "\nIncfNode{" +
                "place=" + place +
                ", delta=" + delta +
                '}' + "\n";
    }
}
