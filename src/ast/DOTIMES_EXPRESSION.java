package ast;

public class DOTIMES_EXPRESSION extends ASTNode {
    private VARIABLE variable;
    private ASTNode limit;
    private ASTNode body;

    public DOTIMES_EXPRESSION(VARIABLE variable, ASTNode limit, ASTNode body) {
        this.variable = variable;
        this.limit = limit;
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sDotimes Expression:\n%s\tVariable: %s\n%s\tLimit: %s\n%s\tBody: %s",
                indent, indent, variable.prettyPrint(indent + "\t"), indent, limit.prettyPrint(indent + "\t"), indent, body.prettyPrint(indent + "\t"));
    }
}