package org.example.ast.oop;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class DefmethodNode extends ASTNode {
    public String methodName;
    public List<ASTNode> parameters = new ArrayList<>();
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDefmethodNode{" +
                "methodName='" + methodName + '\'' +
                ", parameters=" + parameters +
                ", body=" + body +
                '}' + "\n";
    }
}
