package ast;

public class ADDITION extends ASTNode {
    private ASTNode left;
    private ASTNode right;

    public ADDITION(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sAddition:\n%s\tLeft: %s\n%s\tRight: %s",
                indent, indent, left.prettyPrint(indent + "\t"), indent, right.prettyPrint(indent + "\t"));
    }

}