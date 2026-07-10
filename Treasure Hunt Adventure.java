import java.util.Random;
import java.util.Scanner;

class TreasureHuntAdventure {

    String playerName;

    int gold = 0;
    int diamonds = 0;
    int keys = 0;
    int health = 100;

    Random random = new Random();

    public void exploreForest() {

        System.out.println("Exploring the Forest...");

        int event = random.nextInt(4);

        switch (event) {

            case 0:
                gold += 20;
                System.out.println("You found 20 gold.");
                break;

            case 1:
                keys++;
                System.out.println("You found an ancient key.");
                break;

            case 2:
                health -= 15;
                System.out.println("A trap injured you.");
                break;

            case 3:
                diamonds++;
                System.out.println("You found a diamond.");
                break;
        }
    }

    public void exploreCave() {

        System.out.println("Exploring the Cave...");

        int event = random.nextInt(4);

        switch (event) {

            case 0:
                gold += 40;
                System.out.println("You found 40 gold.");
                break;

            case 1:
                diamonds += 2;
                System.out.println("You discovered two diamonds.");
                break;

            case 2:
                health -= 25;
                System.out.println("A giant rock hit you.");
                break;

            case 3:
                keys++;
                System.out.println("You found a golden key.");
                break;
        }
    }

    public void openTreasureChest() {

        if (keys == 0) {
            System.out.println("You need a key.");
            return;
        }

        keys--;

        int reward = random.nextInt(3);

        if (reward == 0) {

            gold += 100;
            System.out.println("Chest contains 100 gold.");

        } else if (reward == 1) {

            diamonds += 5;
            System.out.println("Chest contains 5 diamonds.");

        } else {

            health += 20;

            if (health > 100)
                health = 100;

            System.out.println("Chest contains a healing potion.");
        }
    }

    public void showInventory() {

        System.out.println("\nPlayer : " + playerName);
        System.out.println("Health : " + health);
        System.out.println("Gold : " + gold);
        System.out.println("Diamonds : " + diamonds);
        System.out.println("Keys : " + keys);

    }

    public boolean gameOver() {

        return health <= 0;
    }

    public boolean playerWins() {

        return gold >= 300 || diamonds >= 10;
    }

    public void startGame() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        playerName = input.nextLine();

        int choice;

        while (!gameOver() && !playerWins()) {

            System.out.println("\n1. Explore Forest");
            System.out.println("2. Explore Cave");
            System.out.println("3. Open Treasure Chest");
            System.out.println("4. Show Inventory");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    exploreForest();
                    break;

                case 2:
                    exploreCave();
                    break;

                case 3:
                    openTreasureChest();
                    break;

                case 4:
                    showInventory();
                    break;

                case 5:
                    System.out.println("Adventure Ended.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }

        if (playerWins()) {

            System.out.println("\nCongratulations " + playerName + "!");
            System.out.println("You became a Legendary Treasure Hunter!");

        } else {

            System.out.println("\nGame Over!");
            System.out.println("You lost all your health.");

        }

        input.close();
    }

    public static void main(String[] args) {

        TreasureHuntAdventure game = new TreasureHuntAdventure();
        game.startGame();

    }
}
