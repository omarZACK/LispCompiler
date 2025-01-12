package ast;

import java.util.List;
import java.util.stream.Collectors;

public class LISP_FUNCTIONCALL extends ASTNode {
    private String functionName;
    private List<ASTNode> arguments;

    public LISP_FUNCTIONCALL(String functionName, List<ASTNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public String prettyPrint(String indent) {
        return String.format("%s(Function Call: %s %s)", indent, functionName,
                arguments.stream().map(arg -> arg.prettyPrint(indent + "\t")).collect(Collectors.joining(", ")));
    }
}