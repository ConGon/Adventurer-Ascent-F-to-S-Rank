package ItemData;

public class Armor extends Item{
    String armorType;
    int armorValue;

    public Armor(String name, String type, String rarity, int currentStack, int maxStack, int weight, int price, String armorType, int armorValue) {
        super(name, type, rarity, currentStack, maxStack, weight, price);

    }

    // Copy constructor
    public Armor(Armor other) {
        super(other);
        this.armorType = armorType;
        this.armorValue = armorValue;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public int getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(int armorValue) {
        this.armorValue = armorValue;
    }
}
