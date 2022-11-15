package expressions;

import java.util.List;

public class BooleanExpression extends Expression {
    public String op;
    public List<Expression> values;

    public BooleanExpression(String op, List<Expression> values){
        this.op = op;
        this.values = values;
    }
}
