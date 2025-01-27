package ItemData;

public class Item {
    private String name;
    private String type;
    private String rarity;
    private int currentStack;
    private int maxStack;
    private int weight;
    private int price;


    public Item(String name, String type, String rarity, int currentStack, int maxStack, int weight, int price) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.currentStack = currentStack;
        this.maxStack = maxStack;
        this.weight = weight;
        this.price = price;
    }

    public Item(Item item) {
        this.name = item.name;
        this.type = item.type;
        this.rarity = item.rarity;
        this.currentStack = item.currentStack;
        this.maxStack = item.maxStack;
        this.weight = item.weight;
        this.price = item.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getCurrentStack() {
        return currentStack;
    }

    public void setCurrentStack(int currentStack) {
        this.currentStack = currentStack;
    }

    public int getMaxStack() {
        return maxStack;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
