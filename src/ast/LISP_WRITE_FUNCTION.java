package ast;

public class LISP_WRITE_FUNCTION extends ASTNode {
    private ASTNode value;

    public LISP_WRITE_FUNCTION(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sWrite Function:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}