package org.example;

import org.model.Notification;
import org.model.User;
import org.service.EmailNotification;
import org.service.NotificationChanel;
import org.service.PushNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "PAMELA", "pamela@email.com", true);
        NotificationChanel emailChanel = new EmailNotification();
        NotificationChanel pushChanel = new PushNotification();
        Notification emailNotification = new Notification(1L, "Welcome via email", user, emailChanel);
        Notification pushNotification = new Notification(2L, "Welcome via push", user, pushChanel);

        emailNotification.send();
        pushNotification.send();
    }

}