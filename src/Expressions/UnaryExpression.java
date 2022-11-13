package Expressions;

public class UnaryExpression extends Expression {
    public Expression operand;
    public String op;

    public UnaryExpression(Expression operand, String operator){
        this.operand = operand;
        this.op = operator;
    }
}
