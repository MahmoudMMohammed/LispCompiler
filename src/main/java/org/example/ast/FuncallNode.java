package org.example.ast;

// File: src/main/java/com/yourdomain/ast/FuncallNode.java

import java.util.ArrayList;
import java.util.List;

public class FuncallNode extends ASTNode {
    public ASTNode function;
    public List<ASTNode> arguments = new ArrayList<>();

    @Override
    public String toString() {
        return "\nFuncallNode{" +
                "function=" + function +
                ", arguments=" + arguments +
                '}'+ "\n";
    }
}
