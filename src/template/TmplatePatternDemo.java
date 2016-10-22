package template;

/**
 * Created by jinlong on 2016/10/22.
 */
public class TmplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
