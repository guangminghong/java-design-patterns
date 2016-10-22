package mediator;

/**
 * Created by jinlong on 2016/10/22.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robbert");
        User john = new User("John");

        robert.sendMessage("Hi, John");
        john.sendMessage("Hello! Robert");
    }
}
