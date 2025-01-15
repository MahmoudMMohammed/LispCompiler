package org.example.ast.program_constructs;
import java.util.ArrayList;
import java.util.List;
import org.example.ast.ASTNode;

public class Prog2Node extends ASTNode {
    public List<ASTNode> body = new ArrayList<>();

    @Override
    public String toString() {
        return "\nProg2Node{" +
                "body=" + body +
                '}' + "\n";
    }
}
