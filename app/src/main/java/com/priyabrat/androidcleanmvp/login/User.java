package com.priyabrat.androidcleanmvp.login;

/**
 * Created by Priyabrat on 02-04-2017.
 */

public class User {

    private int id;
    private String userName;
    private String userPass;

    public User() {
    }

    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public User(int id, String userName, String userPass) {
        this.id = id;
        this.userName = userName;
        this.userPass = userPass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return userName;
    }

    public void setFirstName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return userPass;
    }

    public void setLastName(String userPass) {
        this.userPass = userPass;
    }
}
