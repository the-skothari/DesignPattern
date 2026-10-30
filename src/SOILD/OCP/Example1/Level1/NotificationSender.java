package SOILD.OCP.Example1.Level1;

import java.util.List;

public class NotificationSender {
    public void sendNotification(List<NotificationType> notificationsTypes, String msg){
        for(NotificationType notificationType : notificationsTypes){
            switch(notificationType){
                case SMS:
                    notificationType.senSMSNotification(msg);
                    break;
                case EMAIL:
                    notificationType.senEmailNotification(msg);
                    break;
                case WHATSAPP:
                    notificationType.senWhatsappNotification(msg);
                    break;
                case PUSH:
                    notificationType.senPushNotification(msg);
                    break;
            }
        }
    }
}
