package ast;

public class LISP_CONDITIONAL extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sConditional", indent);
    }
}