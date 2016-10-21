package chain_of_responsibility;

/**
 * Created by finley on 21/10/16.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Stabdard Console::Logger: " + message);
    }
}
