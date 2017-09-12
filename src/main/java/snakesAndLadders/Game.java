package snakesAndLadders;

import java.util.ArrayList;

public class Game {
    public ArrayList<SnakesAndLadders> makePlaylist() {
        ArrayList<SnakesAndLadders> playlist = new ArrayList<SnakesAndLadders>();
        SnakesAndLadders player1 = new SnakesAndLadders("player 1");
        SnakesAndLadders player2 = new SnakesAndLadders("player 2");
        Die die = new Die();
        while (playlist.isEmpty()) {
            int p1 = die.roll();
            int p2 = die.roll();
            if (p1 > p2) {
                playlist.add(player1);
                playlist.add(player2);
            }
            if (p1 < p2) {
                playlist.add(player2);
                playlist.add(player1);
            }

        }
        return playlist;
    }
}
