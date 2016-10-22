package null_pattern;

/**
 * Created by jinlong on 2016/10/22.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Avaiable in Customer Database";
    }
}
