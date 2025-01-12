package ast;

public class NUMBER extends ASTNode {
    private int value;

    public NUMBER(int value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sNumber: %d", indent, value);
    }
}