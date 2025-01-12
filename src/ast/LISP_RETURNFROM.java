package ast;

public class LISP_RETURNFROM extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sReturn From", indent);
    }
}