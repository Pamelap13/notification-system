package org.service;

import org.model.User;

public interface NotificationChanel {
    void send (String message, User user);
}
