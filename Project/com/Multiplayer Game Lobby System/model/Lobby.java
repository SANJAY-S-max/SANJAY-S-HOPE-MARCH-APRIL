package com.multiplayerlobby.model;

import java.util.ArrayList;
import java.util.List;

public class Lobby {
    private int lobbyId;
    private List<Player> players;
    private Game game;

    public Lobby(int lobbyId, Game game) {
        this.lobbyId = lobbyId;
        this.game = game;
        this.players = new ArrayList<>();
    }

    public boolean addPlayer(Player player) {
        if (players.size() < game.getMaxPlayers()) {
            players.add(player);
            broadcastMessage(player.getName() + " joined the lobby.");
            return true;
        }
        System.out.println("Lobby is full!");
        return false;
    }

    public void removePlayer(Player player) {
        players.remove(player);
        broadcastMessage(player.getName() + " left the lobby.");
    }

    public void broadcastMessage(String message) {
        System.out.println("[Lobby " + lobbyId + "] " + message);
    }

    public int getLobbyId() {
        return lobbyId;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Game getGame() {
        return game;
    }
}