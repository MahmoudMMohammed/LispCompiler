package org.example.ast.list_operations;

import org.example.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class SubstringNode extends ASTNode {
    public ASTNode string;
    public ASTNode start;
    public ASTNode end;

    @Override
    public String toString() {
        return "\nSubstringNode{" +
                "string=" + string +
                ", start=" + start +
                ", end=" + end +
                '}' + "\n";
    }
}
