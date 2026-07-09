import java.util.ArrayList;
import java.util.Scanner;

public class VegetableMarketInventory {

    String vegetableName;
    int quantity;
    double pricePerKg;

    VegetableMarketInventory(String vegetableName, int quantity, double pricePerKg) {
        this.vegetableName = vegetableName;
        this.quantity = quantity;
        this.pricePerKg = pricePerKg;
    }

    double getTotalValue() {
        return quantity * pricePerKg;
    }

    void display() {
        System.out.println("Vegetable : " + vegetableName);
        System.out.println("Quantity  : " + quantity + " Kg");
        System.out.println("Price/Kg  : " + pricePerKg);
        System.out.println("Value     : " + getTotalValue());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<VegetableMarketInventory> vegetables = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Vegetable");
            System.out.println("2. View Inventory");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Vegetable Name: ");
                    String name = input.nextLine();

                    System.out.print("Quantity (Kg): ");
                    int quantity = input.nextInt();

                    System.out.print("Price Per Kg: ");
                    double price = input.nextDouble();

                    vegetables.add(new VegetableMarketInventory(name, quantity, price));

                    System.out.println("Vegetable Added.");
                    break;

                case 2:

                    if (vegetables.isEmpty()) {
                        System.out.println("No Vegetables Found.");
                    } else {

                        int totalQuantity = 0;
                        double totalValue = 0;

                        for (VegetableMarketInventory vegetable : vegetables) {
                            vegetable.display();
                            totalQuantity += vegetable.quantity;
                            totalValue += vegetable.getTotalValue();
                            System.out.println();
                        }

                        System.out.println("Total Vegetables: " + vegetables.size());
                        System.out.println("Total Quantity: " + totalQuantity + " Kg");
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
