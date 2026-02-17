package org.service;

import org.model.User;

import java.util.List;
import java.util.Set;

public class NotificationService {
    public void notify(User user, String message, Set<NotificationChanel> chanels){
        if (!user.isActive()){
            System.out.println("User inactive. Notification skipped");
            return;
        }
        for (NotificationChanel chanel : chanels){
            chanel.send(message,user);
        }
    }
}
