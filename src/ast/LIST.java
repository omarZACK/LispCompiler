package ast;

import java.util.List;
import java.util.stream.Collectors;

public class LIST extends ASTNode {
    private List<ASTNode> elements;

    public LIST(List<ASTNode> elements) {
        this.elements = elements;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "(List:\n" + elements.stream()
                .map(e -> e.prettyPrint(indent + "\t"))
                .collect(Collectors.joining("\n")) + "\n" + indent + ")";
    }
}