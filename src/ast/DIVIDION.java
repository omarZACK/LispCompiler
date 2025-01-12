package ast;

public class DIVIDION extends ASTNode {
    private ASTNode left;
    private ASTNode right;

    public DIVIDION(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sDivision:\n%s\tLeft: %s\n%s\tRight: %s",
                indent, indent, left.prettyPrint(indent + "\t"), indent, right.prettyPrint(indent + "\t"));
    }
}