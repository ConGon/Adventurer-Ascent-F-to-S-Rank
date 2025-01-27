package EntityData;
import Random.DiceRoll;

public class Entity {
    private String name;
    private String race;
    private int statPoints;
    private int currentExp;
    private int maxExp;
    private int health;
    private int strength;
    private int endurance;
    private int stamina;
    private int intelligence;
    private int mana;
    private int toughness;
    private int totalArmor;
    private int gold;

    DiceRoll dice = new DiceRoll();

    public Entity(String name, String race, int statPoints, int currentExp, int maxExp, int health, int strength, int endurance, int stamina, int intelligence, int mana, int toughness, int totalArmor, int gold) {
        this.name = name;
        this.race = race;
        this.statPoints = statPoints;
        this.currentExp = currentExp;
        this.maxExp = maxExp;
        this.health = health;
        this.strength = strength;
        this.endurance = endurance;
        this.stamina = stamina;
        this.intelligence = intelligence;
        this.mana = mana;
        this.toughness = toughness;
        this.totalArmor = totalArmor;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getStatPoints() {
        return statPoints;
    }

    public void setStatPoints(int statPoints) {
        this.statPoints = statPoints;
     }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getTotalArmor() {
        return totalArmor;
    }

    public void setTotalArmor(int totalArmor) {
        this.totalArmor = totalArmor;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}


