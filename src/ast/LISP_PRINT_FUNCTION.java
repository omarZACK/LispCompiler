package ast;

public class LISP_PRINT_FUNCTION extends ASTNode {
    private ASTNode value;

    public LISP_PRINT_FUNCTION(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sPrint Function:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}