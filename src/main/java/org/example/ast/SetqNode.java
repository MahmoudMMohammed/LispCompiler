package org.example.ast;

// File: src/main/java/com/yourdomain/ast/SetqNode.java

public class SetqNode extends ASTNode {
    public String variable;
    public ASTNode value;

    public SetqNode() {
        this.variable = variable;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nSetqNode{" +
                "variable='" + variable + '\'' +
                ", value=" + value +
                '}'+ "\n";
    }
}
