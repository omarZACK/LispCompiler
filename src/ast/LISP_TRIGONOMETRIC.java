package ast;

public class LISP_TRIGONOMETRIC extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sTrigonometric", indent);
    }
}