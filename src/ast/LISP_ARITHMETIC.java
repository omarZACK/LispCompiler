package ast;

public class LISP_ARITHMETIC extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sArithmetic", indent);
    }
}