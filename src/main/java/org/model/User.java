package org.model;

public class User {
    private Long id;
    private String name;
    private String email;
    private boolean active;

    public User(Long id, String name, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }
    public void desactiveUser(){
        this.active = false;
    }
    public void activeUser(){
        this.active = true;
    }
}
