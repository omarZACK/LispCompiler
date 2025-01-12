package ast;

public class DOLIST_EXPRESSION extends ASTNode {
    private VARIABLE variable;
    private ASTNode list;
    private ASTNode body;

    public DOLIST_EXPRESSION(VARIABLE variable, ASTNode list, ASTNode body) {
        this.variable = variable;
        this.list = list;
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sDolist Expression:\n%s\tVariable: %s\n%s\tList: %s\n%s\tBody: %s",
                indent, indent, variable.prettyPrint(indent + "\t"), list.prettyPrint(indent + "\t"), body.prettyPrint(indent + "\t"));
    }
}