package com.multiplayerlobby.util;

public class IDGenerator {
    private static int nextId = 1;

    public static int getNextId() {
        return nextId++;
    }
}