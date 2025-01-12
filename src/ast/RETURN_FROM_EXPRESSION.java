package ast;

public class RETURN_FROM_EXPRESSION extends ASTNode {
    private ASTNode value;

    public RETURN_FROM_EXPRESSION(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sReturn From Expression:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}