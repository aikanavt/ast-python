package expressions;

public class BinaryExpression extends Expression{
    public Expression lhs;
    public String op;
    public Expression rhs;
    

    public BinaryExpression(Expression lhs, Expression rhs, String operator){
        this.lhs = lhs;
        this.rhs = rhs;
        this.op = operator;
    }
}