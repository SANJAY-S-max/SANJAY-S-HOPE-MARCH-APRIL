package com.sessionmanager.main;

import com.sessionmanager.model.*;
import com.sessionmanager.service.*;

public class MainApp {

    public static void main(String[] args) {

        SessionService service = new SessionServiceImpl();

        User user1 = new AdminUser("1", "Alice");
        User user2 = new RegularUser("2", "Bob");

        System.out.println(user1.getRole()); // Polymorphism
        System.out.println(user2.getRole());

        var session1 = service.createSession(user1.userId);
        System.out.println("Session created: " + session1.getSessionId());

        service.invalidateSession(session1.getSessionId());
        System.out.println("Session active: " + session1.isActive());
    }
}