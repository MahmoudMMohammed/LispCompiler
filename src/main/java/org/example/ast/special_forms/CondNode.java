package org.example.ast.special_forms;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CondNode extends ASTNode {
    public List<CondClause> clauses = new ArrayList<>();

    @Override
    public String toString() {
        return "\nCondNode{" +
                "clauses=" + clauses +
                '}' + "\n";
    }

    public static class CondClause {
        public ASTNode condition;
        public List<ASTNode> body = new ArrayList<>();

        @Override
        public String toString() {
            return "\nCondClause{" +
                    "condition=" + condition +
                    ", body=" + body +
                    '}' + "\n";
        }
    }
}