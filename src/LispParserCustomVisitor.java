import gen.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

public class LispParserCustomVisitor extends LispParserBaseVisitor<Void> {

    private final Vocabulary vocab;

    public LispParserCustomVisitor() {
        vocab = LispLexer.VOCABULARY;
    }
    @Override
    public Void visitLisp(LispParser.LispContext ctx) {
        System.out.println("Visiting Lisp program: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitExpression(LispParser.ExpressionContext ctx) {
        System.out.println("Visiting expression: " + getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitList(LispParser.ListContext ctx) {
        System.out.println("Visiting list: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitList_content(LispParser.List_contentContext ctx) {
        System.out.println("Visiting list content: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitArithmetic_expression(LispParser.Arithmetic_expressionContext ctx) {
        System.out.println("Visiting arithmetic expression: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitComparison_expression(LispParser.Comparison_expressionContext ctx) {
        System.out.println("Visiting comparison expression: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitConditional_expression(LispParser.Conditional_expressionContext ctx) {
        System.out.println("Visiting conditional expression: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitIf_expression(LispParser.If_expressionContext ctx) {
        System.out.println("Visiting if expression: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitWhen_expression(LispParser.When_expressionContext ctx) {
        System.out.println("Visiting when expression: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitCond_expression(LispParser.Cond_expressionContext ctx) {
        System.out.println("Visiting cond expression: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitCond_clause(LispParser.Cond_clauseContext ctx) {
        System.out.println("Visiting cond clause: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitCase_expression(LispParser.Case_expressionContext ctx) {
        System.out.println("Visiting case expression: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitCase_clause(LispParser.Case_clauseContext ctx) {
        System.out.println("Visiting case clause:");

        if (ctx.value_list() != null) {
            System.out.println("Keys: " + ctx.value_list().getText());
        }

        List<LispParser.ExpressionContext> results = ctx.expression();
        if (results != null && !results.isEmpty()) {
            for (LispParser.ExpressionContext result : results) {
                System.out.println("Result: " + result.getText());
            }
        }
        return visitChildren(ctx);
    }


    @Override
    public Void visitValue_list(LispParser.Value_listContext ctx) {
        System.out.println("Visiting value list: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitNested_list(LispParser.Nested_listContext ctx) {
        System.out.println("Visiting nested list: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitDefault_clause(LispParser.Default_clauseContext ctx) {
        System.out.println("Visiting default clause: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitLogical_expression(LispParser.Logical_expressionContext ctx) {
        System.out.println("Visiting logical expression: " +  getHumanReadableTree(ctx));
        return visitChildren(ctx);
    }

    public String getHumanReadableTree(ParseTree tree) {
        StringBuilder sb = new StringBuilder();
        traverseTree(tree, sb);
        return sb.toString().trim();
    }

    private void traverseTree(ParseTree tree, StringBuilder sb) {
        if (tree instanceof TerminalNode) {
            Token token = ((TerminalNode) tree).getSymbol();
            String tokenName = vocab.getSymbolicName(token.getType());
            sb.append(token.getText()).append(" ");
        } else {
            for (int i = 0; i < tree.getChildCount(); i++) {
                traverseTree(tree.getChild(i), sb);
            }
        }
    }
}
