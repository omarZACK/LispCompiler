import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestCompiler {
    public static void main(String[] args) throws Exception {
        String lispCode = "src/input.txt";

        CharStream inputStream = CharStreams.fromFileName(lispCode);
        LispLexer lexer = new LispLexer(inputStream);

        // Tokenize the input using the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LispParser parser = new LispParser(tokens);

        ParseTree tree = parser.lisp();

        LispParserBaseVisitor<?> visitor = new LispParserBaseVisitor<>();
        visitor.visit(tree);
    }
}