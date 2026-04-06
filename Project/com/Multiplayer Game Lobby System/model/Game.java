package com.multiplayerlobby.model;

public class Game {
    private String gameName;
    private int maxPlayers;
    private String status;

    public Game(String gameName, int maxPlayers) {
        this.gameName = gameName;
        this.maxPlayers = maxPlayers;
        this.status = "waiting";
    }

    public void start() {
        status = "in-progress";
        System.out.println(gameName + " has started!");
    }

    public void end() {
        status = "ended";
        System.out.println(gameName + " has ended!");
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public String getStatus() {
        return status;
    }

    public String getGameName() {
        return gameName;
    }
}