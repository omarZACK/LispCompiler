package ast;

public class LISP_LIST_STRUCTURE extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sList Structure", indent);
    }
}