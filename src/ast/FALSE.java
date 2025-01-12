package ast;

public class FALSE extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sFalse", indent);
    }
}