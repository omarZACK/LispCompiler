package ast;

public class LISP_CONS extends ASTNode {
    private ASTNode first;
    private ASTNode rest;

    public LISP_CONS(ASTNode first, ASTNode rest) {
        this.first = first;
        this.rest = rest;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sCons:\n%s\tFirst: %s\n%s\tRest: %s",
                indent, indent, first.prettyPrint(indent + "\t"), indent, rest.prettyPrint(indent + "\t"));
    }
}