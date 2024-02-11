package SnakeAndLadder;

public class Dice {
    int numberOfDice;
    Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    int rollDice(){
        int number;
        return (int) (Math.random() * (6*numberOfDice - numberOfDice)) +1;
    }

}
