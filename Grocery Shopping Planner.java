import java.util.ArrayList;
import java.util.Scanner;

public class GroceryShoppingPlanner {

    String itemName;
    int quantity;
    double pricePerUnit;

    GroceryShoppingPlanner(String itemName, int quantity, double pricePerUnit) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Item Name      : " + itemName);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Price Per Unit : " + pricePerUnit);
        System.out.println("Total Price    : " + getTotalPrice());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<GroceryShoppingPlanner> items = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Grocery Shopping Planner =====");
            System.out.println("1. Add Grocery Item");
            System.out.println("2. View Shopping List");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Item Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = input.nextInt();

                    System.out.print("Enter Price Per Unit: ");
                    double price = input.nextDouble();

                    items.add(new GroceryShoppingPlanner(name, quantity, price));

                    System.out.println("Item Added Successfully.");
                    break;

                case 2:

                    if (items.isEmpty()) {
                        System.out.println("No Grocery Items Found.");
                    } else {

                        int totalQuantity = 0;
                        double totalCost = 0;

                        System.out.println("\n===== Shopping List =====");

                        for (GroceryShoppingPlanner item : items) {
                            item.display();
                            totalQuantity += item.quantity;
                            totalCost += item.getTotalPrice();
                        }

                        System.out.println("--------------------------------");
                        System.out.println("Total Items     : " + items.size());
                        System.out.println("Total Quantity  : " + totalQuantity);
                        System.out.println("Total Cost      : " + totalCost);
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
