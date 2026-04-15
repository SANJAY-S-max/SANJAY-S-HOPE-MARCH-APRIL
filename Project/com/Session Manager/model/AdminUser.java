package com.sessionmanager.model;

public class AdminUser extends User {

    public AdminUser(String userId, String name) {
        super(userId, name);
    }

    @Override
    public String getRole() {
        return "ADMIN";
    }
}