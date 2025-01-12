package ast;

public class LISP_SETQ extends ASTNode {
    private VARIABLE variable;
    private ASTNode value;

    public LISP_SETQ(VARIABLE variable, ASTNode value) {
        this.variable = variable;
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sSetq:\n%s\tVariable: %s\n%s\tValue: %s",
                indent, indent, variable.prettyPrint(indent + "\t"), indent, value.prettyPrint(indent + "\t"));
    }
}