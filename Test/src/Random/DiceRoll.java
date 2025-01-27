package Random;

import java.util.Random;


public class DiceRoll {
    Random random = new Random();

    public int attacksRoll(int sides) {
        return random.nextInt(sides) + 1;
    }

    public int penRoll(int sides) {
        return random.nextInt(sides) + 1;
    }

}
