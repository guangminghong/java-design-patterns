package interpreter;

/**
 * Created by finley on 21/10/16.
 */
public class TerminalExpression implements Expression{
    private String date;
    public TerminalExpression(String date) {
        this.date = date;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(date)) {
            return true;
        }
        return false;
    }
}
