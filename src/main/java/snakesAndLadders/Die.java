package snakesAndLadders;

import java.util.Random;

public class Die {

    public int roll(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}
