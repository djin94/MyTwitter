package ru.katechon.domain;

import java.util.Date;

public class PrivateMessages implements Twitter {
    private int id;
    private Users userSender;
    private Users userRecipient;
    private String message;
    private Date date;

    public PrivateMessages(int id, Users userSender, Users userRecipient, String message, Date date) {
        this.id = id;
        this.userSender = userSender;
        this.userRecipient = userRecipient;
        this.message = message;
        this.date = date;
    }

    public PrivateMessages() {
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUserSender() {
        return userSender;
    }

    public void setUserSender(Users userSender) {
        this.userSender = userSender;
    }

    public Users getUserRecipient() {
        return userRecipient;
    }

    public void setUserRecipient(Users userRecipient) {
        this.userRecipient = userRecipient;
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
