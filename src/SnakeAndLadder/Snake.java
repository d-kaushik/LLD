package SnakeAndLadder;

public class Snake {
    int headPoint;
    int tailPoint;
    Snake(int headPoint, int tailPoint){
        this.headPoint = headPoint;
        this.tailPoint = tailPoint;
    }

    public int getHeadPoint() {
        return headPoint;
    }

    public int getTailPoint() {
        return tailPoint;
    }
}
