package SnakeAndLadder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Board {
    private Dice dice;
    List<Player> players;
    Map<Integer, Integer> snakeMap;
    Map<Integer, Integer> ladderMap;
    Map<String, Integer> playerMap;
    int boardSize;
    int winnerPosition;

    Board(Dice dice, List<Player> players, List<Snake> snakes, List<Ladder> ladders, int boardSize){
        this.dice = dice;
        this.players = players;
        this.boardSize = boardSize;
        this.winnerPosition = boardSize*boardSize;
        ladderMap = new HashMap<>();
        snakeMap = new HashMap<>();
        playerMap = new HashMap<>();
        for (Snake snake : snakes) {
            snakeMap.put(snake.getHeadPoint(), snake.getTailPoint());
            //System.out.println("head "+snakeMap.get(snake.getHeadPoint()));
        }
        for (Ladder ladder : ladders) {
            ladderMap.put(ladder.getStartPoint(), ladder.getEndPoint());
        }
        for(Player player : players){
            playerMap.put(player.getPlayerName(), player.getPosition());
        }
    }

    void startGame(){
        while(true){
            if(players.size()<2){
                System.out.println("2 or more players are required to play");
                return;
            }
            Player player = players.removeFirst();
            if(! move(player)){
                players.add(player);
            } else{
                return;
            }
        }
    }

    boolean move(Player player){
        int steps = dice.rollDice();
        int playerPosition = player.getPosition() + steps;
        for (int i=0; i<players.size();i++){
            Player tempPlayer = players.get(i);
            if(tempPlayer.getPosition() == playerPosition){
                System.out.println(player.getPlayerName() + " rolled a "+ steps + " and moved from " + player.getPosition()+ " to "+ playerPosition + " and "+tempPlayer.getPlayerName()+" will start from 0");
                tempPlayer.setPosition(0);
                break;
            }
        }
        if(playerPosition == winnerPosition) {
            System.out.println(player.getPlayerName() + " rolled a "+ steps + " and moved from " + player.getPosition()+ " to "+ playerPosition + " and won the game!");
            player.setPosition(playerPosition);
            return true;
        } else if(playerPosition > winnerPosition){
            System.out.println(player.getPlayerName()+" rolled a "+ steps + ". We can not move");
            return false;
        } else {
            if(snakeMap.containsKey(playerPosition)){
                System.out.println(player.getPlayerName()+" rolled a "+ steps + " and bitten by snake at "+ playerPosition+ " and moved from "+ playerPosition + " to " + snakeMap.get(playerPosition));
                player.setPosition(snakeMap.get(playerPosition));
                return false;
            } else if(ladderMap.containsKey(playerPosition)) {
                System.out.println(player.getPlayerName()+" rolled a "+ steps +" and climbed the ladder at "+ playerPosition+ " and moved from "+playerPosition+ " to "+ladderMap.get(playerPosition));
                player.setPosition(ladderMap.get(playerPosition));
                if(ladderMap.get(playerPosition) == winnerPosition){
                    System.out.println(player.getPlayerName() + " wins the game after climbing the ladder!");
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println(player.getPlayerName()+" rolled a "+steps+" and moved from "+player.getPosition()+ " to "+ playerPosition);
                player.setPosition(playerPosition);
                return false;
            }
        }
    }
}
