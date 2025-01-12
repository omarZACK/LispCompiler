package ast;

public class LISP_VECTOR extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sVector", indent);
    }
}