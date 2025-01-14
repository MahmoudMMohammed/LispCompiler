package org.example.AST;

import java.util.List;
import java.util.Map;

public class LetFormNode extends SpecialFormNode {
    private List<Map.Entry<String, ASTNode>> bindings;
    private ASTNode body;

    public LetFormNode(List<Map.Entry<String, ASTNode>> bindings, ASTNode body) {
        this.bindings = bindings;
        this.body = body;
    }

    public List<Map.Entry<String, ASTNode>> getBindings() {
        return bindings;
    }

    public ASTNode getBody() {
        return body;
    }
}
