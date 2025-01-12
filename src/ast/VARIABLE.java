package ast;

public class VARIABLE extends ASTNode {
    private String name;

    public VARIABLE(String name) {
        this.name = name;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%s Variable: %s", indent, name);
    }
}