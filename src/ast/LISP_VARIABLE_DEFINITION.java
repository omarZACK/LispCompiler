package ast;

public class LISP_VARIABLE_DEFINITION extends ASTNode {
    private VARIABLE variable;
    private ASTNode value;

    public LISP_VARIABLE_DEFINITION(VARIABLE variable, ASTNode value) {
        this.variable = variable;
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sVariable Definition:\n%s\tVariable: %s\n%s\tValue: %s",
                indent, indent, variable.prettyPrint(indent + "\t"), indent, value.prettyPrint(indent + "\t"));
    }
}