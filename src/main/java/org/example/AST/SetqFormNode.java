package org.example.AST;

public class SetqFormNode extends SpecialFormNode {
    private String variableName;
    private ASTNode value;

    public SetqFormNode(String variableName, ASTNode value) {
        this.variableName = variableName;
        this.value = value;
    }

    public String getVariableName() {
        return variableName;
    }

    public ASTNode getValue() {
        return value;
    }
}
