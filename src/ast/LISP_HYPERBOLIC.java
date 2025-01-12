package ast;

public class LISP_HYPERBOLIC extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sHyperbolic", indent);
    }
}