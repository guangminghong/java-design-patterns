package builder;

/**
 * Created by finley on 17/10/16.
 */
public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
