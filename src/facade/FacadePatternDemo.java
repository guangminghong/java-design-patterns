package facade;

/**
 * Created by jinlong on 2016/10/20.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
