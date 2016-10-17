package builder;

/**
 * Created by finley on 17/10/16.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

