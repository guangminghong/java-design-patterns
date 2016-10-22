package visotor;

/**
 * Created by jinlong on 2016/10/22.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
