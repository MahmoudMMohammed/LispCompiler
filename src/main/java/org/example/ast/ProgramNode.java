// File: src/main/java/com/yourdomain/ast/ProgramNode.java
package org.example.ast;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends ASTNode {
    public List<ASTNode> expressions = new ArrayList<>();

    @Override
    public String toString() {
        return "\nProgramNode{" +
                "expressions=" + expressions +
                '}'+ "\n";
    }
}
