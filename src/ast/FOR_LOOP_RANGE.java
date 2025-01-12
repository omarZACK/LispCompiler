package ast;

public class FOR_LOOP_RANGE extends ASTNode {
    private VARIABLE variable;
    private ASTNode start;
    private ASTNode end;
    private ASTNode body;

    public FOR_LOOP_RANGE(VARIABLE variable, ASTNode start, ASTNode end, ASTNode body) {
        this.variable = variable;
        this.start = start;
        this.end = end;
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sFor Loop Range:\n%s\tVariable: %s\n%s\tStart: %s\n%s\tEnd: %s\n%s\tBody: %s",
                indent, indent, variable.prettyPrint(indent + "\t"), start.prettyPrint(indent + "\t"), end.prettyPrint(indent + "\t"), body.prettyPrint(indent + "\t"));
    }
}