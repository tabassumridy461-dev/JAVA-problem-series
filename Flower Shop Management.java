import java.util.ArrayList;
import java.util.Scanner;

class Flower {

    private int id;
    private String name;
    private double price;
    private int stock;

    public Flower(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("------------------------------");
        System.out.println("Flower ID : " + id);
        System.out.println("Name      : " + name);
        System.out.println("Price     : $" + price);
        System.out.println("Stock     : " + stock);
    }
}

public class FlowerShopManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Flower> flowers = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Flower Shop Management =====");
            System.out.println("1. Add Flower");
            System.out.println("2. View Flowers");
            System.out.println("3. Sell Flower");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Flower ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Flower Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Stock: ");
                    int stock = sc.nextInt();

                    flowers.add(new Flower(id, name, price, stock));

                    System.out.println("Flower added successfully.");
                    break;

                case 2:

                    if (flowers.isEmpty()) {
                        System.out.println("No flowers available.");
                    } else {
                        for (Flower flower : flowers) {
                            flower.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Flower ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Flower flower : flowers) {

                        if (flower.getId() == searchId) {

                            found = true;

                            System.out.print("Quantity: ");
                            int quantity = sc.nextInt();

                            if (quantity <= flower.getStock()) {

                                flower.setStock(flower.getStock() - quantity);

                                double total = quantity * flower.getPrice();

                                System.out.println("Sale Successful");
                                System.out.println("Total Bill: $" + total);

                            } else {

                                System.out.println("Not enough stock.");

                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Flower not found.");
                    }

                    break;

                case 4:

                    System.out.println("Thank you for using the system.");
                    break;

                default:

                    System.out.println("Invalid choice.");

            }

        } while (choice != 4);

        sc.close();
    }
}
