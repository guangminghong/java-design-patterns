package facade;

/**
 * Created by jinlong on 2016/10/20.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
