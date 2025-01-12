package ast;

public class LIST_FORM_ID extends ASTNode {
    private String id;

    public LIST_FORM_ID(String id) {
        this.id = id;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sList Form ID: %s", indent, id);
    }
}