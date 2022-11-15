package statements;

import java.util.List;

import expressions.Expression;

public class Lambda implements Statement {
    public List<String> args; 
    public Expression expression;

    public Lambda(List<String> arguments, Expression expr) {
        this.args = arguments;
        this.expression = expr;
    }
}
