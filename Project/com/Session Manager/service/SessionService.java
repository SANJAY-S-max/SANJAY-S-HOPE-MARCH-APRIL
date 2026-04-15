package com.sessionmanager.service;

import com.sessionmanager.model.Session;

public interface SessionService {
    Session createSession(String userId);
    void invalidateSession(String sessionId);
    Session getSession(String sessionId);
}