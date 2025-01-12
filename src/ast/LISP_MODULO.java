package ast;

public class LISP_MODULO extends ASTNode {
    private ASTNode dividend;
    private ASTNode divisor;

    public LISP_MODULO(ASTNode dividend, ASTNode divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sModulo:\n%s\tDividend: %s\n%s\tDivisor: %s",
                indent, indent, dividend.prettyPrint(indent + "\t"), indent, divisor.prettyPrint(indent + "\t"));
    }
}