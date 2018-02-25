package com.anthony.androidexpensemanager.Entity;

/**
 * Created by Win10 on 2/25/2018.
 */

public class UserData {
    private int status;
    private String message;
    private User user;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
