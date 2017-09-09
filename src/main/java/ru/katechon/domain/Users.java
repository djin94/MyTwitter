package ru.katechon.domain;

public class Users implements Twitter {
    private int id;
    private String login;
    private String password;
    private String email;
    private Roles role;

    public Users() {
    }

    public Users(int id, String login, String password, String email, Roles role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
