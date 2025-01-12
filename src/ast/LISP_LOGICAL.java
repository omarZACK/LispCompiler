package ast;

public class LISP_LOGICAL extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sLogical", indent);
    }
}