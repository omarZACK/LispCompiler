package ast;

public class LOGARITHM extends ASTNode {
    private ASTNode value;

    public LOGARITHM(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sLogarithm:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}