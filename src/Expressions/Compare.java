package expressions;

import java.util.List;

public class Compare extends Expression {
    public Expression left;
    public List<String> ops;
    public List<Expression> comparators;

    public Compare(Expression left, List<String> ops, List<Expression> comparators){
        this.left = left;
        this.ops = ops;
        this.comparators = comparators;
    }
}
