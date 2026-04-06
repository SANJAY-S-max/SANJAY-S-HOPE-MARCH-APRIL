package com.multiplayerlobby.model;

import com.multiplayerlobby.model.Lobby;

public abstract class Player {
    protected int id;
    protected String name;
    protected String status;
    protected Lobby currentLobby;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = "offline";
    }

    public void joinLobby(Lobby lobby) {
        if (lobby.addPlayer(this)) {
            currentLobby = lobby;
            status = "online";
            System.out.println(name + " joined lobby " + lobby.getLobbyId());
        } else {
            System.out.println(name + " could not join lobby " + lobby.getLobbyId());
        }
    }

    public void leaveLobby() {
        if (currentLobby != null) {
            currentLobby.removePlayer(this);
            System.out.println(name + " left lobby " + currentLobby.getLobbyId());
            currentLobby = null;
            status = "offline";
        }
    }

    public void sendMessage(String message) {
        if (currentLobby != null) {
            currentLobby.broadcastMessage(name + ": " + message);
        } else {
            System.out.println("You are not in a lobby.");
        }
    }

    public String getName() {
        return name;
    }
}