package org.example.ast.miscellaneous;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class SetfNode extends ASTNode {
    public ASTNode place;
    public ASTNode value;

    @Override
    public String toString() {
        return "\nSetfNode{" +
                "place=" + place +
                ", value=" + value +
                '}' + "\n";
    }
}
