package ast;

public class LISP_ARRAY extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sArray", indent);
    }
}