package ast;

public class TRUE extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%s True", indent);
    }
}