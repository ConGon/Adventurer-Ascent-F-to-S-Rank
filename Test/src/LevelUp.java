import EntityData.Player;


public class LevelUp {

    private static boolean exitStatAllocation = false;

    public static void statAllocation(int statPoints) {
        boolean exitStatAllocation = false;

        System.out.println("===STAT ALLOCATION===");
        System.out.println("=====================");
        System.out.println("|  Stat Points:  " + "  |");
        System.out.println("=====================");
        System.out.println("|  Health:       100|");
        System.out.println("|  Strength:     50 |");
        System.out.println("|  Endurance:    5  |");
        System.out.println("|  Intelligence: 5  |");
        System.out.println("|  Toughness:    5  |");
        System.out.println("=====================");

        Player player = CharacterCreator.getPlayer();
        player.setStatPoints(player.getStatPoints() + statPoints);

        statSelector(player);
    }
    public static void statSelector(Player player) {

        while (!exitStatAllocation) {
            System.out.print("Stat to increase, Health(HTH), Strenth(STR), Endurance(END), Intelligence(INT), Toughness(TGH), Back(B): ");
            String playerInput = InputHandler.scanner.nextLine().trim();

            switch (playerInput.toUpperCase()) {

                case "HTH":
                    allocateHealth(player);
                    break;

                case "STR":
                    break;

                case "END":
                    break;

                case "INT":
                    break;

                case "TGH":
                    break;

                case "B":
                    exitStatAllocation = true;
                    break;

                default:
                    System.out.println("Invalid Input");

            }

        }

    }

    private static void allocateHealth(Player player) {
        int healthMultiplier = 10;

            while (!exitStatAllocation) {

                if (player.getStatPoints() <= 0) {
                    System.out.println("No stat points left!");
                    return;
                }

                System.out.print("Back(B), Increase health by: ");
                String playerInput = InputHandler.scanner.nextLine().trim();

                if (playerInput.equalsIgnoreCase("B")) {
                    return;
                }

                if (Integer.parseInt(playerInput) >= player.getStatPoints()) {
                    player.setHealth((player.getStatPoints() * healthMultiplier) + player.getHealth());

                    System.out.println("Increased Health Stat by: " + player.getStatPoints() );
                    System.out.println("Your new health is: " + player.getHealth());

                    player.setStatPoints(0);
                    return;

                } else {
                    player.setHealth((Integer.parseInt(playerInput) * healthMultiplier) + player.getHealth());

                    System.out.println("Increased your Health Stat by: " + playerInput);
                    System.out.println("Your new health is: " + player.getHealth());

                    player.setStatPoints(player.getStatPoints() - Integer.parseInt(playerInput));
                    return;
                }

            }



    }
}
