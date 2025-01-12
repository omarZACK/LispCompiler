package ast;

public class LISP_PREDEFINEDFUNCTION extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sPredefined Function", indent);
    }
}