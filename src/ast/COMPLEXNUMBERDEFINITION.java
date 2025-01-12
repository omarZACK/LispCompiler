package ast;

public class COMPLEXNUMBERDEFINITION extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sComplex Number Definition", indent);
    }
}