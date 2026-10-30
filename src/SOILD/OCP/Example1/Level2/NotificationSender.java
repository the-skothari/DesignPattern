package SOILD.OCP.Example1.Level2;

import java.util.List;

public class NotificationSender {
    public void sendNotifications(List<Notification> notifications, String msg){
        for(Notification notification : notifications){
            notification.sendMessage(msg);
        }
    }
}
