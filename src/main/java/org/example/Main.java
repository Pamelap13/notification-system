package org.example;

import org.model.Notification;
import org.model.User;
import org.service.EmailNotification;
import org.service.NotificationChanel;
import org.service.NotificationService;
import org.service.PushNotification;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "PAMELA", "pamela@email.com", true);
//
        Set<NotificationChanel> channels = new HashSet<>();
        channels.add(new EmailNotification());
        channels.add(new PushNotification());
        //Envio de notificaciones
        NotificationService service = new NotificationService();
        service.notify(user, "Welcome", channels);
    }
}