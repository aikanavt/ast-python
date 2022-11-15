package statements;

import java.util.List;

public class TryExcept implements Statement{
    public List<Statement> tryBody;
    public List<Statement> exceptBody;

    public TryExcept(List<Statement> tryBody, List<Statement> exceptBody) {
        this.tryBody = tryBody;
        this.exceptBody = exceptBody;
    }
}
