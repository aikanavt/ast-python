package statements;

import java.util.List;

import expressions.Expression;

public class WhileLoop implements Statement {
    public Expression condition;
    public List<Statement> body;
    
    public WhileLoop(Expression cond, List<Statement> bod) {
        this.condition = cond;
        this.body = bod;
    }
}