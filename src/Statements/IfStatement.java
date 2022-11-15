package statements;
import java.beans.Expression;
import java.util.List;

public class IfStatement implements Statement {
    public Expression condition;
    public List<Statement> body;
    public List<Statement> elsebody;

    public IfStatement(Expression cond, List<Statement> body, List<Statement> elsebody) {
        this.condition = cond;
        this.body = body;
        this.elsebody = elsebody;
    }
}
