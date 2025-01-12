package ast;

public class BLOCK_EXPRESSION extends ASTNode {
    private ASTNode body;

    public BLOCK_EXPRESSION(ASTNode body) {
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sBlock Expression:\n%s\tBody: %s", indent, indent, body.prettyPrint(indent + "\t"));
    }
}