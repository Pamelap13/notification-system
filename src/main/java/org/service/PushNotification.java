package org.service;

import org.model.User;

public class PushNotification implements NotificationChanel{
    @Override
    public void send(String message, User user) {

        System.out.println("Sending PUSH Notification to user: "+ user.getName() + ": "+ message);
    }
}
