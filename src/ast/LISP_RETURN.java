package ast;

public class LISP_RETURN extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sReturn", indent);
    }
}