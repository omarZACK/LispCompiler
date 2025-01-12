package ast;

public class NUMBER_EXPRESSION extends ASTNode {
    private NUMBER number;

    public NUMBER_EXPRESSION(NUMBER number) {
        this.number = number;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sNumber Expression: %s", indent, number.prettyPrint(indent));
    }
}