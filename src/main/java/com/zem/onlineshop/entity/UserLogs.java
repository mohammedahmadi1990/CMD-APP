package com.zem.onlineshop.entity;

import java.util.Date;

public class UserLogs {

    private int id;
    private User user;
    private Date date;
    private String description;

    public UserLogs() {
    }

    public UserLogs(int id, User user, Date date, String description) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
