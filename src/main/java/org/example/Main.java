package org.example;

import org.model.Notification;
import org.model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "PAMELA", "pamela@email.com", true);
        Notification notification = new Notification(1L, "Welcome to the system", user);
        notification.send();
        user.desactiveUser();
        notification.send();
    }
}