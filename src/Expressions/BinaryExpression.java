package Expressions;

public class BinaryExpression extends Expression{
    public Expression lhs;
    public Expression rhs;
    public String operator;

    public BinaryExpression(Expression lhs, Expression rhs, String operator){
        this.lhs = lhs;
        this.rhs = rhs;
        this.operator = operator;
    }
}