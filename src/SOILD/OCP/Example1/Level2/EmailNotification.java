package SOILD.OCP.Example1.Level2;

public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String msg) {
        System.out.println("EmailNotifications "+msg);
    }
}
