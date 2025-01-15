package org.example.ast.miscellaneous;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class OptionalNode extends ASTNode {
    public List<ASTNode> parameters = new ArrayList<>();

    @Override
    public String toString() {
        return "\nOptionalNode{" +
                "parameters=" + parameters +
                '}' + "\n";
    }
}
