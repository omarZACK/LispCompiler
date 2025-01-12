package ast;

import java.util.ArrayList;
import java.util.List;
import gen.*;
import gen.LispParser.*;

public class ASTBuilderVisitor extends LispParserBaseVisitor <ASTNode>{
	
	private List<String> vars;//store all the variable declared in the program so far
	public List<String> semanticsErrors;

	
	public ASTBuilderVisitor() {
		// TODO Auto-generated constructor stub
		this.vars=new ArrayList<String>();
		this.semanticsErrors=new ArrayList<String>();
	}
}
