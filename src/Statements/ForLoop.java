package statements;

import java.util.List;

import expressions.Expression;
import main.Type;

public class ForLoop implements Statement {
    public Expression iterator;
    public Type iterable; 
    public Expression range; //range(start, end, inc value)
    public List<Statement> body;

    public ForLoop(Expression it, Type field, Expression range, List<Statement> bod) {
        this.iterator = it;
        this.iterable = field;
        this.range = range;
        this.body = bod;
    }
}
