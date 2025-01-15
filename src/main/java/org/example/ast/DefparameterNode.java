package org.example.ast;// File: src/main/java/com/yourdomain/ast/DefparameterNode.java

public class DefparameterNode extends ASTNode {
    public String name;
    public ASTNode value;

    public DefparameterNode() {}

    public DefparameterNode(String name, ASTNode value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nDefparameterNode{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}'+ "\n";
    }
}
