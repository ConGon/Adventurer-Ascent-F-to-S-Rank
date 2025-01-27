package ItemData;


public class Weapon extends Item {
    private int armorPen;
    private int diceValue;

    public Weapon(String name, String type, String rarity, int currentStack, int maxStack, int weight, int price, int armorPen, int diceValue) {
        super(name, type, rarity, currentStack, maxStack, weight, price);
        this.armorPen = armorPen;
        this.diceValue = diceValue;
    }

    // Copy constructor
    public Weapon(Weapon other) {
        super(other);
        this.armorPen = other.armorPen;
        this.diceValue = other.diceValue;
    }

    public int getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }

    public int getArmorPen() {
        return armorPen;
    }

    public void setArmorPen(int armorPen) {
        this.armorPen = armorPen;
    }

}
