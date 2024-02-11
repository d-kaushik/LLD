package SnakeAndLadder;

import java.util.Queue;

public class Player {
    int playerId;
    String playerName;
    int position;
    Queue <Integer> playerMove;
    Player(){

    }
    Player(int playerId, String playerName, int position){
        this.playerId = playerId;
        this.playerName = playerName;
        this.position = position;
    }

    int getPlayerId(){
        return playerId;
    }
    String getPlayerName(){
        return playerName;
    }
    int getPosition(){
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
