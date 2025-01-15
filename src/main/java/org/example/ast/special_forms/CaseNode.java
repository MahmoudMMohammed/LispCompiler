package org.example.ast.special_forms;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CaseNode extends ASTNode {
    public ASTNode key;
    public List<CaseClause> clauses = new ArrayList<>();

    @Override
    public String toString() {
        return "\nCaseNode{" +
                "key=" + key +
                ", clauses=" + clauses +
                '}' + "\n";
    }

    public static class CaseClause {
        public ASTNode condition;
        public List<ASTNode> body = new ArrayList<>();

        @Override
        public String toString() {
            return "\nCaseClause{" +
                    "condition=" + condition +
                    ", body=" + body +
                    '}' + "\n";
        }
    }
}
