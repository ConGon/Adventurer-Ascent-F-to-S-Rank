package ItemData;

import EntityData.Player;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private Player player;

    List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addToInventory(Item item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            if (items.isEmpty()) {
                items.add(item);
                item.setCurrentStack(1);
                continue;
            }

            if (item.getCurrentStack() == item.getMaxStack()) {
                if (item instanceof Weapon) {
                    item = new Weapon((Weapon) item);
                    items.add(item);

                } else if (item instanceof Armor) {
                    item = new Armor((Armor) item);
                    items.add(item);

                } else {
                    item = new Item(item);
                    items.add(item);
                }

                item.setCurrentStack(1);

            } else {
                int currentStack = item.getCurrentStack();
                currentStack++;

                item.setCurrentStack(currentStack);

            }
        }
    }

    // Player controlled to control which slot they remove from
    public void removeFromInventory(int slot, int quantity) {

        Item item = items.get(slot);
        if (item.getCurrentStack() <= quantity) {
            items.remove(item);
        } else {
            item.setCurrentStack(item.getCurrentStack() - quantity);
        }
    }

    public void sellItem(Player player1, int slot, int quantity) {
        Item item = items.get(slot);

        if (item.getCurrentStack() <= quantity) {
            player1.setGold((item.getPrice() * item.getCurrentStack()) + player1.getGold()) ;
            items.remove(slot);
        } else {
            player1.setGold((item.getPrice() * quantity) + player1.getGold());
            item.setCurrentStack(item.getCurrentStack() - quantity);
        }



    }

    public void openInventory(Player player1) {
        int slot = 0;
        for (Item item : items) {
            slot++;
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(MessageFormat.format(

                    "Slot: {0} | {1} | Rarity: {2} | Price: {3} | Weight: {4} | " +
                    "Current Stack: {5} | Max Stack: {6}", slot, item.getName(),
                    item.getRarity(), item.getPrice(), item.getWeight(),
                    item.getCurrentStack(), item.getMaxStack()));

            if (item instanceof Weapon) {
                Weapon weapon = (Weapon) item;
                System.out.println(MessageFormat.format(
                        "Item Type: {0} | Armor Pen: {1} | Dice: {2}",
                        weapon.getType(), weapon.getArmorPen(), weapon.getDiceValue()
                ));

            }

            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(MessageFormat.format(
                    "                  -Health: {0}, Stamina: {1}, Mana: {2}, Gold: {3}-",
                    player1.getHealth(), player1.getStamina(), player1.getMana(),
                    player1.getGold()));

        }
    }


}
