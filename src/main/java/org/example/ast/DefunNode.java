// File: src/main/java/com/yourdomain/ast/DefunNode.java
package org.example.ast;

import java.util.ArrayList;
import java.util.List;

public class DefunNode extends ASTNode {
    public String functionName;
    public List<String> parameters = new ArrayList<>();
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nDefunNode{" +
                "functionName='" + functionName + '\'' +
                ", parameters=" + parameters +
                ", body=" + body +
                '}'+ "\n";
    }
}
