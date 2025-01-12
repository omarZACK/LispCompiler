package ast;

public class LISP_LCM extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sLCM", indent);
    }
}