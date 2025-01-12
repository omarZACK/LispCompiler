package ast;

public class EXPONENTIATION extends ASTNode {
    private ASTNode base;
    private ASTNode exponent;

    public EXPONENTIATION(ASTNode base, ASTNode exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sExponentiation:\n%s\tBase: %s\n%s\tExponent: %s",
                indent, indent, base.prettyPrint(indent + "\t"), indent, exponent.prettyPrint(indent + "\t"));
    }
}