package decorator;

/**
 * Created by jinlong on 2016/10/20.
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
