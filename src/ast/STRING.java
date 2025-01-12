package ast;

public class STRING extends ASTNode {
    private String value;

    public STRING(String value) {
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sString: \"%s\"", indent, value);
    }
}