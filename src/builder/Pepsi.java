package builder;

/**
 * Created by finley on 17/10/16.
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
