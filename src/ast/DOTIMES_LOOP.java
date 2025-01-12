package ast;

public class DOTIMES_LOOP extends ASTNode {
    private VARIABLE variable;
    private ASTNode limit;
    private ASTNode body;

    public DOTIMES_LOOP(VARIABLE variable, ASTNode limit, ASTNode body) {
        this.variable = variable;
        this.limit = limit;
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sDotimes Loop:\n%s\tVariable: %s\n%s\tLimit: %s\n%s\tBody: %s",
                indent, indent, variable.prettyPrint(indent + "\t"), limit.prettyPrint(indent + "\t"), body.prettyPrint(indent + "\t"));
    }
}