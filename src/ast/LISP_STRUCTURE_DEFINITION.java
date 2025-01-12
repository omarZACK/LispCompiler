package ast;

public class LISP_STRUCTURE_DEFINITION extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sStructure Definition", indent);
    }
}