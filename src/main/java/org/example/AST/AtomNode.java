package org.example.AST;

public class AtomNode extends ASTNode {
    private String value; // Raw value of the atom

    public AtomNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
