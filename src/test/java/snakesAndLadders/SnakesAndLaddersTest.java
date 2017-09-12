package snakesAndLadders;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SnakesAndLaddersTest {

    SnakesAndLadders snakesAndLadders;
    final int FIRST_SQUARE = 1;

    @Before
    public void setup() {
        snakesAndLadders = new SnakesAndLadders("player1");

    }

    @Test
    public void startsWithOne() {
        Assert.assertEquals(1, snakesAndLadders.getSquare());
    }

    @Test
    public void moveThreemakesFour() {
        snakesAndLadders.move(3);
        Assert.assertEquals(4, snakesAndLadders.getSquare());
    }

    @Test
    public void moveThreeThenFourMakesEight() {
        snakesAndLadders.move(3);
        snakesAndLadders.move(4);
        Assert.assertEquals(8, snakesAndLadders.getSquare());
    }

    @Test
    public void rollDie() {
        for (int i = 0; i < 1000; i++) {
            Die die = new Die();
            int amount = die.roll();
            Assert.assertTrue(amount >= 1 && amount <= 6);
        }
    }

//    @Test
//    public void movesAmountOfDie() {
//        Die die = new Die();
//        int value = die.roll();
//        snakesAndLadders.move(value);
//        Assert.assertEquals(value + FIRST_SQUARE, snakesAndLadders.getSquare());
//    }

    @Test
    public void playerWinsAtHundred() {
        final int SQUARE97 = 97;
        snakesAndLadders.setSquare(SQUARE97);
        snakesAndLadders.move(3);
        Assert.assertEquals(100, snakesAndLadders.getSquare());
        Assert.assertEquals(true, snakesAndLadders.isWinner());
    }

    @Test
    public void cantGoFurtherThanHundred() {
        final int SQUARE97 = 97;
        snakesAndLadders.setSquare(SQUARE97);
        snakesAndLadders.move(4);
        Assert.assertEquals(97, snakesAndLadders.getSquare());
    }

    @Test
    public void snakesGoDownTwelveToTwo() {
        final int SQUARE6 = 6;
        snakesAndLadders.setSquare(SQUARE6);
        snakesAndLadders.move(6);
        Assert.assertEquals(2, snakesAndLadders.getSquare());
    }

    @Test
    public void laddersGoUpFiveToTen() {
        snakesAndLadders.move(4);
        Assert.assertEquals(10, snakesAndLadders.getSquare());
    }


}
