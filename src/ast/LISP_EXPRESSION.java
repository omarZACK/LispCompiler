package ast;

import java.util.List;

public class LISP_EXPRESSION extends ASTNode {
    private List<ASTNode> declarations;

    public LISP_EXPRESSION(List<ASTNode> declarations) {
        this.declarations = declarations;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder(indent + "Program:\n");
        for (ASTNode declaration : declarations) {
            sb.append(declaration.prettyPrint(indent + "\t")).append("\n");
        }
        return sb.toString();
    }
}