package ast;

public class CONJUGATE extends ASTNode {
    private ASTNode value;

    public CONJUGATE(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sConjugate:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}