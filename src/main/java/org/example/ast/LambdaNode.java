// File: src/main/java/com/yourdomain/ast/LambdaNode.java
package org.example.ast;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class LambdaNode extends ASTNode {
    public List<String> parameters = new ArrayList<>();
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nLambdaNode{" +
                "parameters=" + parameters +
                ", body=" + body +
                '}'+ "\n";
    }
}
