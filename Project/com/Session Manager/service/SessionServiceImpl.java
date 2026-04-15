package com.sessionmanager.service;

import com.sessionmanager.model.Session;
import com.sessionmanager.util.SessionUtil;

import java.util.HashMap;
import java.util.Map;

public class SessionServiceImpl implements SessionService {

    private Map<String, Session> sessionMap = new HashMap<>();

    @Override
    public Session createSession(String userId) {
        String sessionId = SessionUtil.generateSessionId();
        Session session = new Session(sessionId, userId);
        sessionMap.put(sessionId, session);
        return session;
    }

    @Override
    public void invalidateSession(String sessionId) {
        Session session = sessionMap.get(sessionId);
        if (session != null) {
            session.invalidate();
        }
    }

    @Override
    public Session getSession(String sessionId) {
        return sessionMap.get(sessionId);
    }
}