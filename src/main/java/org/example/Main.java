package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.AST.ASTBuilder;
import org.example.AST.ASTNode;
import org.example.AST.Evaluator;
import org.example.LispLexer;
import org.example.LispParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder fileContent = new StringBuilder();

        // Read the Lisp file
        try {
            File code = new File("testLisp.lisp");
            Scanner reader = new Scanner(code);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                fileContent.append(data).append("\n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        String fileContentString = fileContent.toString();

        // Tokenize the input
        LispLexer lexer = new LispLexer(CharStreams.fromString(fileContentString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Parse the input
        LispParser parser = new LispParser(tokens);
        ParseTree tree = parser.s_expr(); // Assuming `s_expr` is the root rule

        // Print the parsed tree (for debugging)
        System.out.println("Parsed Tree: " + tree.toStringTree(parser));

        // Build the AST
        ASTBuilder astBuilder = new ASTBuilder(parser); // You'd implement ASTBuilder to traverse and build AST
        ASTNode ast = astBuilder.visit(tree);

        // Evaluate the AST
        Evaluator evaluator = new Evaluator(); // Implement Evaluator to process AST
        Object result = evaluator.evaluate(ast);

        // Print the result
        System.out.println("Result: " + result);
    }
}
