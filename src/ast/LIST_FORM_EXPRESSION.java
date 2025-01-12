package ast;

public class LIST_FORM_EXPRESSION extends ASTNode {
    private ASTNode expression;

    public LIST_FORM_EXPRESSION(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sList Form Expression:\n%s\tExpression: %s", indent, indent, expression.prettyPrint(indent + "\t"));
    }
}