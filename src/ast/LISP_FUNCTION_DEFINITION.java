package ast;

public class LISP_FUNCTION_DEFINITION extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sFunction Definition", indent);
    }
}