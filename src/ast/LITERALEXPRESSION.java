package ast;

public class LITERALEXPRESSION extends ASTNode {
    private String value;

    public LITERALEXPRESSION(String value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sLiteral: %s", indent, value);
    }
}