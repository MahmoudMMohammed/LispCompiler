// File: src/main/java/com/yourdomain/ast/IfNode.java
package org.example.ast;

import org.example.ast.ASTNode;

public class IfNode extends ASTNode {
    public ASTNode condition;
    public ASTNode thenBranch;
    public ASTNode elseBranch; // Can be null if not provided

    @Override
    public String toString() {
        return "\nIfNode{" +
                "condition=" + condition +
                ", thenBranch=" + thenBranch +
                ", elseBranch=" + elseBranch +
                '}'+ "\n";
    }
}
