package ast;

public class LISP_FLOOR extends ASTNode {
    private ASTNode value;

    public LISP_FLOOR(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sFloor:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}