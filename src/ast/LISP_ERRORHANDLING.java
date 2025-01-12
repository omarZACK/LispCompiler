package ast;

public class LISP_ERRORHANDLING extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sError Handling", indent);
    }
}