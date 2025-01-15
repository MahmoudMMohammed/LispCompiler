// File: src/main/java/com/yourdomain/ast/LetNode.java
package org.example.ast;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class LetNode extends ASTNode {
    public List<Binding> bindings = new ArrayList<>();
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nLetNode{" +
                "bindings=" + bindings +
                ", body=" + body +
                '}'+ "\n";
    }

    // Inner class to represent individual bindings
    public static class Binding {
        public String variable;
        public ASTNode value;

        public Binding(String variable, ASTNode value) {
            this.variable = variable;
            this.value = value;
        }

        @Override
        public String toString() {
            return "\nBinding{" +
                    "variable='" + variable + '\'' +
                    ", value=" + value +
                    '}'+ "\n";
        }
    }
}
