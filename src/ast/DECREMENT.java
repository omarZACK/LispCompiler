package ast;

public class DECREMENT extends ASTNode {
    private VARIABLE variable;

    public DECREMENT(VARIABLE variable) {
        this.variable = variable;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sDecrement:\n%s\tVariable: %s", indent, indent, variable.prettyPrint(indent + "\t"));
    }
}