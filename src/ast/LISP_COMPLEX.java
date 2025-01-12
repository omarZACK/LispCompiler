package ast;

public class LISP_COMPLEX extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sComplex", indent);
    }
}