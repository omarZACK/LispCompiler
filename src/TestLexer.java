import org.antlr.v4.runtime.*;
import java.io.IOException;

public class TestLexer {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("src/input.txt");
        LispLexer lexer = new LispLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        for (Token token : tokens.getTokens()) {
            String tokenName = lexer.getVocabulary().getSymbolicName(token.getType());
            if (tokenName == null) {
                System.out.println("Unrecognized Token: Text: \"" + token.getText() + "\"" + ", line: " + token.getLine() + ", column: " + token.getCharPositionInLine());
            } else {
                System.out.println("Token Type: " + tokenName + ", Text: \"" + token.getText() + "\"" + ", line: " + token.getLine() + ", column: " + token.getCharPositionInLine());
            }
        }
    }
}
