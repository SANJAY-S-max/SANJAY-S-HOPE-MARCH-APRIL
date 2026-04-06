package com.multiplayerlobby.main;

import com.multiplayerlobby.model.*;
import com.multiplayerlobby.service.LobbyManager;

public class Main {
    public static void main(String[] args) {
        LobbyManager manager = new LobbyManager();

        Game chess = new Game("Chess", 2);
        Lobby lobby1 = manager.createLobby(chess);

        Player admin = new AdminPlayer(1, "Alice");
        Player player = new Player(2, "Bob") {
            // Anonymous subclass for abstract Player
        };

        admin.joinLobby(lobby1);
        player.joinLobby(lobby1);

        admin.sendMessage("Welcome to the game!");
        player.sendMessage("Hi Alice!");

        ((AdminPlayer) admin).kickPlayer(player);
        ((AdminPlayer) admin).startGame();
    }
}