package mediator;

/**
 * Created by jinlong on 2016/10/22.
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

    public User(String name) {
        this.name = name;
    }
}
