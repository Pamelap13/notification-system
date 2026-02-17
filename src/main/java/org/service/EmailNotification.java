package org.service;

import org.model.User;

public class EmailNotification implements NotificationChanel{
    @Override
    public void send(String message, User user) {
        if (user.isActive()){
            System.out.println("Sending Email to: " + user.getEmail());
            System.out.println("Message: "+ message);
        }
        else {
            System.out.println("User inactive, Cannot send email");
        }
    }
}
