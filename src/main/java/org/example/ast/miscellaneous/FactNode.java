package org.example.ast.miscellaneous;

import org.example.ast.ASTNode;

public class FactNode extends ASTNode {
    public ASTNode value;

    @Override
    public String toString() {
        return "\nFactNode{" +
                "value=" + value +
                '}' + "\n";
    }
}
