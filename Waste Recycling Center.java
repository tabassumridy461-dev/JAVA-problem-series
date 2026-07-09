import java.util.ArrayList;
import java.util.Scanner;

public class WasteRecyclingCenter {

    String wasteType;
    double weight;
    double pricePerKg;

    WasteRecyclingCenter(String wasteType, double weight, double pricePerKg) {
        this.wasteType = wasteType;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    double getTotalValue() {
        return weight * pricePerKg;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Waste Type    : " + wasteType);
        System.out.println("Weight        : " + weight + " Kg");
        System.out.println("Price Per Kg  : " + pricePerKg);
        System.out.println("Total Value   : " + getTotalValue());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<WasteRecyclingCenter> records = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Waste Recycling Center =====");
            System.out.println("1. Add Waste Record");
            System.out.println("2. View Recycling Report");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Waste Type: ");
                    String type = input.nextLine();

                    System.out.print("Enter Weight (Kg): ");
                    double weight = input.nextDouble();

                    System.out.print("Enter Price Per Kg: ");
                    double price = input.nextDouble();

                    records.add(new WasteRecyclingCenter(type, weight, price));

                    System.out.println("Waste Record Added Successfully.");
                    break;

                case 2:

                    if (records.isEmpty()) {
                        System.out.println("No Records Found.");
                    } else {

                        double totalWeight = 0;
                        double totalValue = 0;

                        System.out.println("\n===== Recycling Report =====");

                        for (WasteRecyclingCenter record : records) {
                            record.display();
                            totalWeight += record.weight;
                            totalValue += record.getTotalValue();
                        }

                        System.out.println("--------------------------------");
                        System.out.println("Total Records : " + records.size());
                        System.out.println("Total Weight  : " + totalWeight + " Kg");
                        System.out.println("Total Value   : " + totalValue);
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
