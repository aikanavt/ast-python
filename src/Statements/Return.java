package statements;

import expressions.Expression;
import main.Type;

public class Return implements Statement{
    public Type returntype; 
    public Expression returnValue;
    public Return(Type type, Expression value) {
        this.returntype = type;
        this.returnValue = value;
    }

}
