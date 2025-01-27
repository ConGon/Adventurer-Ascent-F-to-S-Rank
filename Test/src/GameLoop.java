public class GameLoop {

    CharacterCreator characterCreator = new CharacterCreator();

    // System.out.println();

    public void mainGameLoop(){
        System.out.println("From F to S: Adventurer Simulator");
        System.out.println("=================================");
        System.out.println("|           MAIN MENU           |");
        System.out.println("|          New Game(NG)         |");
        System.out.println("|          Options(OP)          |");
        System.out.println("|            Quit(Q)            |");
        System.out.println("=================================");

        while(true) {
            System.out.print("Input (NG, OP, Q): ");
            String playerInput = InputHandler.scanner.nextLine().trim();

            switch (playerInput.toUpperCase()) {
                case "NG":
                    System.out.println("You selected New Game");
                    characterCreator.createCharacter();
                    break;

                case "OP":
                    System.out.println("You selected Options");
                    break;

                case "Q":
                    System.out.println("You selected Quit");

                default:
                    System.out.println("Invalid Input");
            }
        }





    }


}
