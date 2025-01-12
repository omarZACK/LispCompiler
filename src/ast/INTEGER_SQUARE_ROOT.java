package ast;

public class INTEGER_SQUARE_ROOT extends ASTNode {
    private ASTNode value;

    public INTEGER_SQUARE_ROOT(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sInteger Square Root:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}