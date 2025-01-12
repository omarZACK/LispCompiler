package ast;

public class LISP_HASHVECTOR extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sHash Vector", indent);
    }
}