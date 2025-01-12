package ast;

public class LISP_MACRO_DEFINITION extends ASTNode {
    @Override
    public String prettyPrint(String indent) {
        return String.format("%sMacro Definition", indent);
    }
}