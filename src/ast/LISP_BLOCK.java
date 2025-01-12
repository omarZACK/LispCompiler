package ast;

public class LISP_BLOCK extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sBlock", indent);
    }
}