package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Specify the path to the Lisp file
        String filePath = "src/main/java/org/example/testLisp.lisp"
                ;

        try {
            // Create a lexer for the Lisp file
            LispLexer lexer = new LispLexer(CharStreams.fromFileName(filePath));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            // Print tokens with details
            System.out.printf("%-8s %-8s %-8s %-20s %s\n", "Index", "Row", "Col", "Type", "Value");
            System.out.println("-----------------------------------------------------------");

            for (Token token : tokens.getTokens()) {
                String tokenType = getTokenTypeName(lexer, token.getType());
                System.out.printf(
                        "%-8d %-8d %-8d %-20s %s\n",
                        token.getTokenIndex(),     // Token index
                        token.getLine(),          // Row
                        token.getCharPositionInLine(), // Column
                        tokenType,                // Token type name
                        token.getText()           // Token value
                );
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    // Helper method to map token type numbers to their names
    private static String getTokenTypeName(LispLexer lexer, int tokenType) {
        if (tokenType == Token.EOF) {
            return "EOF"; // End of File token
        }
        return LispLexer.VOCABULARY.getSymbolicName(tokenType);
    }
}
