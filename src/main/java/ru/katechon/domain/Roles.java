package ru.katechon.domain;

public class Roles implements Twitter{
    private int id;
    private String title;

    public Roles(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Roles() {
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
