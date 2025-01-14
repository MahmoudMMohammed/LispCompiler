package org.example.AST;

import java.util.List;

public class LambdaFormNode extends SpecialFormNode {
    private List<String> parameters;
    private ASTNode body;

    public LambdaFormNode(List<String> parameters, ASTNode body) {
        this.parameters = parameters;
        this.body = body;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public ASTNode getBody() {
        return body;
    }
}
