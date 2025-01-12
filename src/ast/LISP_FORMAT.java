package ast;

public class LISP_FORMAT extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sFormat", indent);
    }
}