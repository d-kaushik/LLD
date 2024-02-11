package SnakeAndLadder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String [] args){
        int totalSnakes =9;
        Snake snake1  = new Snake(62, 5);
        Snake snake2  = new Snake(33, 6);
        Snake snake3  = new Snake(49, 9);
        Snake snake4  = new Snake(88, 16);
        Snake snake5  = new Snake(41, 20);
        Snake snake6  = new Snake(56, 53);
        Snake snake7  = new Snake(98, 64);
        Snake snake8  = new Snake(93, 73);
        Snake snake9  = new Snake(95, 75);
        List <Snake> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);
        snakes.add(snake4);
        snakes.add(snake5);
        snakes.add(snake6);
        snakes.add(snake7);
        snakes.add(snake8);
        snakes.add(snake9);

        int totalLadder =8;
        Ladder ladder1  = new Ladder(2, 37);
        Ladder ladder2  = new Ladder(27, 46);
        Ladder ladder3  = new Ladder(10, 32);
        Ladder ladder4  = new Ladder(51, 68);
        Ladder ladder5  = new Ladder(61, 79);
        Ladder ladder6  = new Ladder(65, 84);
        Ladder ladder7  = new Ladder(71, 91);
        Ladder ladder8  = new Ladder(81, 100);
        List<Ladder> ladders = new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);
        ladders.add(ladder3);
        ladders.add(ladder4);
        ladders.add(ladder5);
        ladders.add(ladder6);
        ladders.add(ladder7);
        ladders.add(ladder8);

        int numberOfPlayers= 2;
        Player player1 = new Player(0,"Player1",0);
        Player player2 = new Player(1, "Player2", 0);
        List<Player> allPlayers = new LinkedList<>();
        allPlayers.add(player1);
        allPlayers.add(player2);

        int boardSize = 10;
        int numberOfDice = 2;
        Dice dice = new Dice(2);

        Board board = new Board(dice, allPlayers, snakes, ladders, boardSize);
        board.startGame();

    }
}

