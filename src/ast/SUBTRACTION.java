package ast;

public class SUBTRACTION extends ASTNode {
    private ASTNode left;
    private ASTNode right;

    public SUBTRACTION(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sSubtraction:\n%s\tLeft: %s\n%s\tRight: %s",
                indent, indent, left.prettyPrint(indent + "\t"), indent, right.prettyPrint(indent + "\t"));
    }
}