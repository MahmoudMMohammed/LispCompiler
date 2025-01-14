package org.example.AST;

import java.util.List;

public class OtherSpecialExprNode extends OtherExpressionsNode {
    private String name;
    private List<ASTNode> arguments;

    public OtherSpecialExprNode(String name, List<ASTNode> arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    public String getName() {
        return name;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }
}
