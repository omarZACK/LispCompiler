package ast;

public class LISP_HASHED extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sHashed", indent);
    }
}