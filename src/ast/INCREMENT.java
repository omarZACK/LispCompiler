package ast;

public class INCREMENT extends ASTNode {
    private VARIABLE variable;

    public INCREMENT(VARIABLE variable) {
        this.variable = variable;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sIncrement:\n%s\tVariable: %s", indent, indent, variable.prettyPrint(indent + "\t"));
    }
}