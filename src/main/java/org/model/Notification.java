package org.model;

import org.service.NotificationChanel;

public class Notification {
    private Long id;
    private String message;
    private User user;
    private NotificationChanel chanel;

    public Notification(Long id, String message, User user, NotificationChanel chanel) {
        this.id = id;
        this.message = message;
        this.user = user;
        this.chanel = chanel;
    }
    public void send(){
        chanel.send(message, user);
//        if (user.isActive()){
//            System.out.println("Sending notification to: " + user.getEmail());
//            System.out.println("Message: " + message);
//        }
//        else {
//            System.out.println("user is inactive. Canot send notification.");
//        }
    }
}
