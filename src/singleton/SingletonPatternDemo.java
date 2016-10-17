package singleton;

/**
 * Created by finley on 17/10/16.
 */
public class SingletonPatternDemo {
    public  static void  main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
