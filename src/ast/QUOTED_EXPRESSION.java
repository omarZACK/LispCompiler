package ast;

public class QUOTED_EXPRESSION extends ASTNode {
    private ASTNode expression;

    public QUOTED_EXPRESSION(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%s(quote %s)", indent, expression.prettyPrint(indent));
    }
}