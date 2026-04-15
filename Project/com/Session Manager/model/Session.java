package com.sessionmanager.model;

public class Session {
    private String sessionId;
    private String userId;
    private long createdTime;
    private boolean isActive;

    public Session(String sessionId, String userId) {
        this.sessionId = sessionId;
        this.userId = userId;
        this.createdTime = System.currentTimeMillis();
        this.isActive = true;
    }

    // Getters & Setters
    public String getSessionId() { return sessionId; }
    public String getUserId() { return userId; }
    public boolean isActive() { return isActive; }

    public void invalidate() {
        this.isActive = false;
    }
}