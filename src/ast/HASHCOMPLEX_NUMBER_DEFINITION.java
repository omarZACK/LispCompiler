package ast;

public class HASHCOMPLEX_NUMBER_DEFINITION extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sHash Complex Number Definition", indent);
    }
}