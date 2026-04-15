package com.sessionmanager.model;

public class RegularUser extends User {

    public RegularUser(String userId, String name) {
        super(userId, name);
    }

    @Override
    public String getRole() {
        return "USER";
    }
}