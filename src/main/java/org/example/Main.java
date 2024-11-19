import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.example.LispLexer;

public class Main {
    public static void main(String[] args) {
        StringBuilder fileContent = new StringBuilder();

        try {
            File code = new File("testLisp.lisp");
            Scanner reader = new Scanner(code);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                fileContent.append(data).append("\n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String fileContentString = fileContent.toString();

        LispLexer lexer = new LispLexer(CharStreams.fromString(fileContentString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        for (int i = 0; i < tokens.getTokens().size(); i++) {
            Token token = tokens.get(i);
            String tokenType = LispLexer.VOCABULARY.getSymbolicName(token.getType());
            System.out.printf("Index: %d, Line: %d, Column: %d, Type: %s, Value: %s%n",
                    i, token.getLine(), token.getCharPositionInLine(), tokenType, token.getText());
        }
    }
}
