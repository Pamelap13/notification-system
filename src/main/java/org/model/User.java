package org.model;

public class User {
    private final Long id;
    private String name;
    private String email;
    private boolean active;

    public User(Long id, String name, String email, boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active = active;
        if (email == null){
            throw new IllegalArgumentException("Email cannot be null");
        }
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

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user =(User) o;
        if (this.id == null || user.id == null  ) return false;
        return this.id.equals(user.id);
    }

    public int hashCode(){
        return (id != null)? id.hashCode() : System.identityHashCode(this);
    }
}
