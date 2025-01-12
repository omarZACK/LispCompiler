package ast;

public class LISP_FLOAT extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sFloat", indent);
    }
}