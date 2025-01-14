package org.example.AST;

import java.util.List;

public class FuncallFormNode extends SpecialFormNode {
    private ASTNode function;
    private List<ASTNode> arguments;

    public FuncallFormNode(ASTNode function, List<ASTNode> arguments) {
        this.function = function;
        this.arguments = arguments;
    }

    public ASTNode getFunction() {
        return function;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }
}
