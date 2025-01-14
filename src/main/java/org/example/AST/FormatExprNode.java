package org.example.AST;

import java.util.List;

public class FormatExprNode extends ASTNode {
    private String formatString;
    private List<ASTNode> arguments;

    public FormatExprNode(String formatString, List<ASTNode> arguments) {
        this.formatString = formatString;
        this.arguments = arguments;
    }

    public String getFormatString() {
        return formatString;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }
}
