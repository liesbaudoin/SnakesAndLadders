package snakesAndLadders;

import java.util.HashMap;

public class SnakesAndLadders {
    private static final int LAST_SQUARE = 100;
    private int square;
    private boolean isWinner = false;
    private HashMap<Integer, Integer> snakeMap = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> ladderMap = new HashMap<Integer, Integer>();

    public SnakesAndLadders() {
        this.square = 1;
        snakeMap.put(12, 2);
        ladderMap.put(5,10);
    }


    public void move(int amount) {
        int newSquare = calculateNewSquare(amount);

        if (newSquare > LAST_SQUARE) {
            return;
        }
        this.square = newSquare;
        if (this.square == LAST_SQUARE) {
            makeWinner();
        }
    }

    private int calculateNewSquare(int amount) {
        int newSquare = square + amount;
        if (snakeMap.containsKey(newSquare)){
            newSquare = snakeMap.get(newSquare);
        }
        if (ladderMap.containsKey(newSquare)){
            newSquare = ladderMap.get(newSquare);
        }
        return newSquare;
    }

    private void makeWinner() {
        isWinner = true;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public int getSquare() {
        return square;
    }

    void setSquare(int square) {
        this.square = square;
    }//package private
}
