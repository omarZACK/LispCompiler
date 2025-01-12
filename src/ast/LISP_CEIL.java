package ast;

public class LISP_CEIL extends ASTNode {
    private ASTNode value;

    public LISP_CEIL(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sCeil:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}