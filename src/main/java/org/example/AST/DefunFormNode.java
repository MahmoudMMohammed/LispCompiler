package org.example.AST;

import java.util.List;

public class DefunFormNode extends SpecialFormNode {
    private String functionName;
    private List<String> parameters;
    private ASTNode body;

    public DefunFormNode(String functionName, List<String> parameters, ASTNode body) {
        this.functionName = functionName;
        this.parameters = parameters;
        this.body = body;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public ASTNode getBody() {
        return body;
    }
}
