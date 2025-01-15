package org.example.ast.type_case_expressions;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class EtypecaseNode extends ASTNode {
    public ASTNode key;
    public List<TypecaseClause> clauses = new ArrayList<>();

    @Override
    public String toString() {
        return "\nEtypecaseNode{" +
                "key=" + key +
                ", clauses=" + clauses +
                '}' + "\n";
    }

    public static class TypecaseClause {
        public ASTNode type;
        public List<ASTNode> body = new ArrayList<>();

        @Override
        public String toString() {
            return "\nTypecaseClause{" +
                    "type=" + type +
                    ", body=" + body +
                    '}' + "\n";
        }
    }
}
