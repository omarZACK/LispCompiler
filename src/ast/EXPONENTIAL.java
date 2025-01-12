package ast;

public class EXPONENTIAL extends ASTNode {
    private ASTNode base;
    private ASTNode exponent;

    public EXPONENTIAL(ASTNode base, ASTNode exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sExponential:\n%s\tBase: %s\n%s\tExponent: %s",
                indent, indent, base.prettyPrint(indent + "\t"), indent, exponent.prettyPrint(indent + "\t"));
    }
}