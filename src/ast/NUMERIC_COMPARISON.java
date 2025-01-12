package ast;

public class NUMERIC_COMPARISON extends ASTNode {
    private ASTNode left;
    private ASTNode right;

    public NUMERIC_COMPARISON(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sNumeric Comparison:\n%s\tLeft: %s\n%s\tRight: %s",
                indent, indent, left.prettyPrint(indent + "\t"), indent, right.prettyPrint(indent + "\t"));
    }
}