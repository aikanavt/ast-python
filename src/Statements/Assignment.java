package statements;

import expressions.Expression;
import main.ASTElement;
import main.Label;


public class Assignment extends ASTElement{
    public Label lhs;
    public Expression rhs;

    public Assignment(int line, int column, String fileLocation, Label lhs, Expression rhs) {
        super(line, column, fileLocation);
        this.lhs = lhs;
        this.rhs = rhs;
    }
    
}
