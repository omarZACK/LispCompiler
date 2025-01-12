package ast;

public class ERROR_EXPRESSION extends ASTNode {
    private String message;

    public ERROR_EXPRESSION(String message) {
        this.message = message;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sError: %s", indent, message);
    }
}