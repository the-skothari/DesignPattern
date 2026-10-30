package SOILD.OCP.Example1.Level1;

public enum NotificationType {
    SMS,
    EMAIL,
    WHATSAPP,
    PUSH;

    public void senSMSNotification(String msg){
        System.out.println("SMS "+msg);
    }

    public void senEmailNotification(String msg){
        System.out.println("Email "+msg);
    }
    public void senWhatsappNotification(String msg){
        System.out.println("Whatsapp "+msg);
    }
    public void senPushNotification(String msg){
        System.out.println("Push "+msg);
    }
}
