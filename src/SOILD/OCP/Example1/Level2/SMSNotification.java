package SOILD.OCP.Example1.Level2;

public class SMSNotification implements Notification {
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS Notification "+msg);
    }
}
