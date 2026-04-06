package com.multiplayerlobby.model;

public class AdminPlayer extends Player {

    public AdminPlayer(int id, String name) {
        super(id, name);
    }

    public void startGame() {
        if (currentLobby != null && currentLobby.getGame() != null) {
            currentLobby.getGame().start();
        } else {
            System.out.println("No game in lobby to start.");
        }
    }

    public void kickPlayer(Player player) {
        if (currentLobby != null && currentLobby.getPlayers().contains(player)) {
            currentLobby.removePlayer(player);
            System.out.println(player.getName() + " has been kicked from lobby " + currentLobby.getLobbyId());
        }
    }
}