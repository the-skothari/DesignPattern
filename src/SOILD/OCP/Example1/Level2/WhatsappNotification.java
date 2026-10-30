package SOILD.OCP.Example1.Level2;

public class WhatsappNotification implements Notification {
    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsappNotifications "+msg);
    }
}
