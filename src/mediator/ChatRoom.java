package mediator;

import java.util.Date;

/**
 * Created by jinlong on 2016/10/22.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]");
    }
}
