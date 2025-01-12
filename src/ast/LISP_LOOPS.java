package ast;

public class LISP_LOOPS extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sLoops", indent);
    }
}