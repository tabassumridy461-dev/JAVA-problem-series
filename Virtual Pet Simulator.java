import java.util.Scanner;

class VirtualPetSimulator {

    String petName;
    int hunger = 50;
    int happiness = 50;
    int energy = 50;

    public void feedPet() {

        hunger -= 15;

        if (hunger < 0) {
            hunger = 0;
        }

        happiness += 5;

        if (happiness > 100) {
            happiness = 100;
        }

        System.out.println(petName + " enjoyed the food!");
    }

    public void playPet() {

        happiness += 15;
        energy -= 10;
        hunger += 10;

        if (happiness > 100) {
            happiness = 100;
        }

        if (energy < 0) {
            energy = 0;
        }

        if (hunger > 100) {
            hunger = 100;
        }

        System.out.println(petName + " had fun playing!");
    }

    public void sleepPet() {

        energy += 30;

        if (energy > 100) {
            energy = 100;
        }

        hunger += 10;

        if (hunger > 100) {
            hunger = 100;
        }

        System.out.println(petName + " had a good sleep!");
    }

    public void showStatus() {

        System.out.println("\nPet Name : " + petName);
        System.out.println("Hunger   : " + hunger);
        System.out.println("Happiness: " + happiness);
        System.out.println("Energy   : " + energy);
    }

    public void startGame() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your pet's name: ");
        petName = input.nextLine();

        int choice;

        do {

            System.out.println("\n1. Feed Pet");
            System.out.println("2. Play with Pet");
            System.out.println("3. Let Pet Sleep");
            System.out.println("4. Show Status");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    feedPet();
                    break;

                case 2:
                    playPet();
                    break;

                case 3:
                    sleepPet();
                    break;

                case 4:
                    showStatus();
                    break;

                case 5:
                    System.out.println("Thanks for taking care of " + petName + "!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        input.close();
    }

    public static void main(String[] args) {

        VirtualPetSimulator pet = new VirtualPetSimulator();
        pet.startGame();

    }
}
