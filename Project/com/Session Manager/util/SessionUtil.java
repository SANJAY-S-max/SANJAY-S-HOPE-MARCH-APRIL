package com.sessionmanager.util;

import java.util.UUID;

public class SessionUtil {

    public static String generateSessionId() {
        return UUID.randomUUID().toString();
    }
}