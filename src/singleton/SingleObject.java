package singleton;

/**
 * Created by finley on 17/10/16.
 */
public class SingleObject {
    private static  SingleObject instance = new SingleObject();
    private SingleObject(){};//instanciated
    public static SingleObject getInstance(){
        return  instance;
    }

    public  void  showMessage() {
        System.out.println("Hellow world");
    }
}
