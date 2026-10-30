package SOILD.OCP.Example1.Level2;

public class PushNotification implements Notification {
    @Override
    public void sendMessage(String msg) {
        System.out.println("PushNotifications "+msg);
    }
}
