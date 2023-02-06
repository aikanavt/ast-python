package expressions;

import main.ASTElement;
import main.Type;

public class Expression extends ASTElement{ 
    public Type type;  

    public Expression(int line, int column, String fileLocation){
        super(line, column, fileLocation);
    }

    public Type getType(){
        return type;
    }
}