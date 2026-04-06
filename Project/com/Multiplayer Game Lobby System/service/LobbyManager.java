package com.multiplayerlobby.service;

import com.multiplayerlobby.model.Lobby;
import com.multiplayerlobby.model.Game;
import com.multiplayerlobby.util.IDGenerator;

import java.util.ArrayList;
import java.util.List;

public class LobbyManager {
    private List<Lobby> lobbies;

    public LobbyManager() {
        lobbies = new ArrayList<>();
    }

    public Lobby createLobby(Game game) {
        int lobbyId = IDGenerator.getNextId();
        Lobby lobby = new Lobby(lobbyId, game);
        lobbies.add(lobby);
        System.out.println("Lobby " + lobby.getLobbyId() + " created for game " + game.getGameName());
        return lobby;
    }

    public void removeLobby(Lobby lobby) {
        lobbies.remove(lobby);
        System.out.println("Lobby " + lobby.getLobbyId() + " removed.");
    }

    public void listLobbies() {
        System.out.println("Current lobbies:");
        for (Lobby lobby : lobbies) {
            System.out.println("Lobby ID: " + lobby.getLobbyId() + ", Game: " + lobby.getGame().getGameName() +
                    ", Players: " + lobby.getPlayers().size());
        }
    }
}