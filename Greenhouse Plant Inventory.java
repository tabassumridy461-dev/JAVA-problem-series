import java.util.ArrayList;
import java.util.Scanner;

public class GreenhousePlantInventory {

    String plantName;
    String plantType;
    int quantity;
    double pricePerPlant;

    GreenhousePlantInventory(String plantName, String plantType, int quantity, double pricePerPlant) {
        this.plantName = plantName;
        this.plantType = plantType;
        this.quantity = quantity;
        this.pricePerPlant = pricePerPlant;
    }

    double getTotalValue() {
        return quantity * pricePerPlant;
    }

    void display() {
        System.out.println("Plant Name : " + plantName);
        System.out.println("Plant Type : " + plantType);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Price      : " + pricePerPlant);
        System.out.println("Value      : " + getTotalValue());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<GreenhousePlantInventory> plants = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Plant");
            System.out.println("2. View Inventory");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Plant Name: ");
                    String name = input.nextLine();

                    System.out.print("Plant Type: ");
                    String type = input.nextLine();

                    System.out.print("Quantity: ");
                    int quantity = input.nextInt();

                    System.out.print("Price Per Plant: ");
                    double price = input.nextDouble();

                    plants.add(new GreenhousePlantInventory(name, type, quantity, price));

                    System.out.println("Plant Added.");
                    break;

                case 2:

                    if (plants.isEmpty()) {
                        System.out.println("No Plants Found.");
                    } else {

                        int totalQuantity = 0;
                        double totalValue = 0;

                        for (GreenhousePlantInventory plant : plants) {
                            plant.display();
                            totalQuantity += plant.quantity;
                            totalValue += plant.getTotalValue();
                            System.out.println();
                        }

                        System.out.println("Total Plants: " + plants.size());
                        System.out.println("Total Quantity: " + totalQuantity);
                        System.out.println("Total Value: " + totalValue);
                    }

                    break;

                case 3:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 3);

        input.close();
    }
}
