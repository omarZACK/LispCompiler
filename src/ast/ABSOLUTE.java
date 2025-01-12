package ast;

public class ABSOLUTE extends ASTNode {
    private ASTNode value;

    public ABSOLUTE(ASTNode value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sAbsolute:\n%s\tValue: %s", indent, indent, value.prettyPrint(indent + "\t"));
    }
}