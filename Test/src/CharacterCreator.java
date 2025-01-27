import EntityData.Player;
import ItemData.Armor;
import ItemData.Item;

import java.util.ArrayList;
import java.util.List;

public class CharacterCreator {
    private static Player player = new Player();


    public void createCharacter() {
        System.out.println("Create your character");
        raceSelector();

    }

    private void raceSelector() {
        System.out.println("SELECT YOUR RACE");
        System.out.println("================");
        System.out.println("|   Human(HU)  |");
        System.out.println("|   Dwarf(DW)  |");
        System.out.println("|   Demon(DE)  |");
        System.out.println("|    Elf (EL)  |");
        System.out.println("================");

        while (true) {
            System.out.print("Input (HU, DW, DE, EL): ");
            String playerInput = InputHandler.scanner.nextLine().trim();

            switch (playerInput.toUpperCase()) {
                case "HU":
                    humanSelected();
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }

    }
    private void humanSelected() {
        System.out.println("The human is an intelligent and determined creature.");
        System.out.println("Known for their all around abilities and the ability to adapt.");

        System.out.println("=====HUMAN STATS=====");
        System.out.println("=====================");
        System.out.println("|  Health:       100|");
        System.out.println("|  Strength:     5  |");
        System.out.println("|  Endurance:    5  |");
        System.out.println("|  Intelligence: 5  |");
        System.out.println("|  Toughness:    5  |");
        System.out.println("=====================");

        while (true) {
            System.out.print("Choose Human race? Yes(Y), Back(B): ");
            String playerInput = InputHandler.scanner.nextLine().trim();

            switch (playerInput.toUpperCase()) {
                case "Y":
                    String playerChoice = "Human";
                    raceStatAllocation(playerChoice);
                    break;

                case "B":
                    raceSelector();
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        }


    }

    private void raceStatAllocation(String playerChoice) {
        if (playerChoice.equals("Human")) {
            player.setRace("Human");
            player.setHealth(100);
            player.setStrength(5);
            player.setEndurance(5);
            player.setIntelligence(5);
            player.setToughness(5);

            LevelUp.statAllocation(5);

            startingEquipment();
        }

    }

    private void startingEquipment() {
        List<Item> items;
        items = new ArrayList<>();

        Armor rustyHelm = new Armor("Rusty Helm", "Armor", "Common", 1,
                1, 5, 50, "Helmet", 1);





        while (true) {
            System.out.println("Starting Equipment!!!");
        }


    }

    public static Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
