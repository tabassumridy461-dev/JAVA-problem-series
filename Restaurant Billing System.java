import java.util.Scanner;

public class RestaurantBillingSystem {

    // Instance Variables
    private String customerName;
    private String foodName;
    private int quantity;
    private double price;
    private double totalBill;

    // Constructor
    public RestaurantBillingSystem(String customerName, String foodName,
                                   int quantity, double price) {
        this.customerName = customerName;
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to Calculate Bill
    public void calculateBill() {
        totalBill = quantity * price;
    }

    // Method to Print Bill
    public void printBill() {

        System.out.println("\n====================================");
        System.out.println("       RESTAURANT BILL");
        System.out.println("====================================");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Food Item     : " + foodName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price         : Tk. " + price);
        System.out.println("------------------------------------");
        System.out.println("Total Bill    : Tk. " + totalBill);
        System.out.println("====================================");
        System.out.println("Thank You! Visit Again.");
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      WELCOME TO JAVA RESTAURANT");
        System.out.println("====================================");

        System.out.print("Enter Customer Name: ");
        String customerName = input.nextLine();

        System.out.println("\n----------- MENU -----------");
        System.out.println("1. Burger      - Tk. 250");
        System.out.println("2. Pizza       - Tk. 500");
        System.out.println("3. Fried Rice  - Tk. 300");
        System.out.println("4. Chicken BBQ - Tk. 450");
        System.out.println("5. Soft Drink  - Tk. 50");

        System.out.print("\nChoose Item (1-5): ");
        int choice = input.nextInt();

        String food = "";
        double price = 0;

        switch (choice) {

            case 1:
                food = "Burger";
                price = 250;
                break;

            case 2:
                food = "Pizza";
                price = 500;
                break;

            case 3:
                food = "Fried Rice";
                price = 300;
                break;

            case 4:
                food = "Chicken BBQ";
                price = 450;
                break;

            case 5:
                food = "Soft Drink";
                price = 50;
                break;

            default:
                System.out.println("Invalid Choice!");
                input.close();
                return;
        }

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        // Create Object
        RestaurantBillingSystem order =
                new RestaurantBillingSystem(customerName, food, quantity, price);

        // Calculate Bill
        order.calculateBill();

        // Print Bill
        order.printBill();

        input.close();
    }
}
