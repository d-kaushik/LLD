package SnakeAndLadder;

public class Ladder {
    int startPoint;
    int endPoint;
    Ladder(int startPoint, int endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public int getStartPoint() {
        return startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }
}
