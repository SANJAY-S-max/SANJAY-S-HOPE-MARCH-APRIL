package com.sessionmanager.model;

public abstract class User {
    protected String userId;
    protected String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public abstract String getRole();
}