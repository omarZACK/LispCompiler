package ast;

public class LISP_GCD extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sGCD", indent);
    }
}