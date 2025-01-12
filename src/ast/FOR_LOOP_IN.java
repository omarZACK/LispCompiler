package ast;

public class FOR_LOOP_IN extends ASTNode {
    private VARIABLE variable;
    private ASTNode collection;
    private ASTNode body;

    public FOR_LOOP_IN(VARIABLE variable, ASTNode collection, ASTNode body) {
        this.variable = variable;
        this.collection = collection;
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sFor Loop In:\n%s\tVariable: %s\n%s\tCollection: %s\n%s\tBody: %s",
                indent, indent, variable.prettyPrint(indent + "\t"), collection.prettyPrint(indent + "\t"), body.prettyPrint(indent + "\t"));
    }
}