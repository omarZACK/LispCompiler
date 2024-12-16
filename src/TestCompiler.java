import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestCompiler {
    public static void main(String[] args) {
        String input = "(case c ((nil) (+ 1 1)) (otherwise \"default\"))";

        try {
            CharStream charStream = CharStreams.fromString(input);

            LispLexer lexer = new LispLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LispParser parser = new LispParser(tokens);
            ParseTree tree = parser.lisp();

            LispParserCustomVisitor visitor = new LispParserCustomVisitor();
            visitor.visit(tree);

        } catch (Exception e) {
            System.err.println(STR."An error occurred: \{e.getMessage()}");
        }
    }
}
