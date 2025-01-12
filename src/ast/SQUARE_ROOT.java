package ast;

public class SQUARE_ROOT extends ASTNode {
    private ASTNode value;

    public SQUARE_ROOT(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sSquare Root:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}