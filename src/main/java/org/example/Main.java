package org.example;

import org.antlr.v4.runtime.*;
import org.example.ast.ASTNode;
import org.example.ast.Visitor;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String input = "test.lisp";
        CharStream source = CharStreams.fromFileName(input);
        LispLexer lexer = new LispLexer(source);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LispParser parser = new LispParser(tokens);
        LispParser.ProgramContext tree = parser.program();

        Visitor visitor = new Visitor();
        ASTNode ast = visitor.visitProgram(tree);

//        System.out.println(tree.toStringTree(parser));
        System.out.println(ast);

    }
}
