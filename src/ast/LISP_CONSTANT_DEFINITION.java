package ast;

public class LISP_CONSTANT_DEFINITION extends ASTNode {
    private String name;
    private ASTNode value;

    public LISP_CONSTANT_DEFINITION(String name, ASTNode value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%sConstant Definition:\n%s\tName: %s\n%s\tValue: %s",
                indent, indent, name, indent, value.prettyPrint(indent + "\t"));
    }
}