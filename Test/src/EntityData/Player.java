package EntityData;

public class Player extends Entity {

    public Player(String name, String race, int statPoints, int currentExp, int maxExp, int health, int strength, int endurance, int stamina, int intelligence, int mana, int toughness, int totalArmor, int gold) {
        super(name, race, statPoints, currentExp, maxExp, health, strength, endurance, stamina, intelligence, mana, toughness, totalArmor, gold);
    }

    public Player() {
        super("Default name", "Default race", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

}
