package ast;

public class LISP_COMPARISON extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sComparison", indent);
    }
}