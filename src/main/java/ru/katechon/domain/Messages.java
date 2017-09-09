package ru.katechon.domain;

import java.util.Date;

public class Messages implements Twitter {
    private int id;
    private Users user;
    private String message;
    private Date date;

    public Messages() {
    }

    public Messages(int id, Users user, String message, Date date) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.date = date;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
