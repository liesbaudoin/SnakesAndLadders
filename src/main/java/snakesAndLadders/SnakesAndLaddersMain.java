package snakesAndLadders;

import java.util.ArrayList;

public class SnakesAndLaddersMain {
    public static void main(String[] args) {
        Die die = new Die();
        Game game = new Game();
        ArrayList<SnakesAndLadders> playlist = game.makePlaylist();
        while (!playlist.get(0).isWinner() && (!playlist.get(1).isWinner())) {
            int dienumber = die.roll();
            playlist.get(0).move(dienumber);
            System.out.println(playlist.get(0).getName() + " rolled " + dienumber + " and has landed on " + playlist.get(0).getSquare());
            if (playlist.get(0).isWinner()) {
                System.out.println(playlist.get(0).getName() + " IS THE WINNER!!!");
                return;
            }
            int dieNumber = die.roll();
            playlist.get(1).move(dieNumber);
            System.out.println(playlist.get(1).getName() + " rolled " + dieNumber + " and has landed on " + playlist.get(1).getSquare());
            if (playlist.get(1).isWinner()) {
                System.out.println(playlist.get(1).getName() + "IS THE WINNER!!!");
            }
        }


    }
}
