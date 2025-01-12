package ast;

public class ERROR_HANDLING extends ASTNode {
    private ASTNode body;

    public ERROR_HANDLING(ASTNode body) {
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sError Handling:\n%s\tBody: %s", indent, indent, body.prettyPrint(indent + "\t"));
    }
}