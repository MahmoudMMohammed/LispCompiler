package org.example.AST;

public class DefparameterFormNode extends SpecialFormNode {
    private String parameterName;
    private ASTNode value;

    public DefparameterFormNode(String parameterName, ASTNode value) {
        this.parameterName = parameterName;
        this.value = value;
    }

    public String getParameterName() {
        return parameterName;
    }

    public ASTNode getValue() {
        return value;
    }
}
