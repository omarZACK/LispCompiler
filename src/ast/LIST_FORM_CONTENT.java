package ast;

public class LIST_FORM_CONTENT extends ASTNode {
    private ASTNode content;

    public LIST_FORM_CONTENT(ASTNode content) {
        this.content = content;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sList Form Content:\n%s\tContent: %s", indent, indent, content.prettyPrint(indent + "\t"));
    }
}