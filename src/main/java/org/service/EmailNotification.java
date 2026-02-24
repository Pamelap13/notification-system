package org.service;

import org.model.User;

public class EmailNotification implements NotificationChanel{
    @Override
    public void send(String message, User user) {

        System.out.println("Sending Email to: " + user.getEmail() + ": "+ message) ;
    }
}
