package ast;

public class LOOP_EXPRESSION extends ASTNode {
    private ASTNode body;

    public LOOP_EXPRESSION(ASTNode body) {
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sLoop Expression:\n%s\tBody: %s", indent, indent, body.prettyPrint(indent + "\t"));
    }
}