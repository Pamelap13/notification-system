package org.model;

public class Notification {
    private Long id;
    private String message;
    private User user;

    public Notification(Long id, String message, User user) {
        this.id = id;
        this.message = message;
        this.user = user;
    }
    public void send(){
        if (user.isActive()){
            System.out.println("Sending notification to: " + user.getEmail());
            System.out.println("Message: " + message);
        }
        else {
            System.out.println("user is inactive. Canot send notification.");
        }
    }
}
