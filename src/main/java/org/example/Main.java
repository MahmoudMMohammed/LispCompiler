package org.example;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) {
        String lispCode = "(defun factorial (n) \"Calculate the factorial of n\" (if (<= n 1) 1 (* n (factorial (- n 1)))))";
        LispLexer lexer = new LispLexer(CharStreams.fromString(lispCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        for (Token token : tokens.getTokens()) {
            System.out.println(token.toString());
        }
    }
}