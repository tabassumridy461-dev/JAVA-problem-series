import java.util.Scanner;

public class ElectricityBillCalculator {

    // Instance Variables
    private String customerName;
    private int customerId;
    private double units;
    private double billAmount;

    // Constructor
    public ElectricityBillCalculator(String customerName, int customerId, double units) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.units = units;
    }

    // Method to Calculate Bill
    public void calculateBill() {

        if (units <= 100) {
            billAmount = units * 5.00;
        }
        else if (units <= 200) {
            billAmount = (100 * 5.00) + ((units - 100) * 7.00);
        }
        else if (units <= 300) {
            billAmount = (100 * 5.00) + (100 * 7.00) + ((units - 200) * 10.00);
        }
        else {
            billAmount = (100 * 5.00) + (100 * 7.00) + (100 * 10.00)
                    + ((units - 300) * 12.00);
        }
    }

    // Method to Display Bill
    public void displayBill() {

        System.out.println("\n========== ELECTRICITY BILL ==========");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Units Used    : " + units);
        System.out.println("Total Bill    : Tk. " + billAmount);
        System.out.println("======================================");
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====== Electricity Bill Calculator ======");

        System.out.print("Enter Customer Name: ");
        String name = input.nextLine();

        System.out.print("Enter Customer ID: ");
        int id = input.nextInt();

        System.out.print("Enter Units Consumed: ");
        double units = input.nextDouble();

        // Create Object
        ElectricityBillCalculator customer =
                new ElectricityBillCalculator(name, id, units);

        // Calculate Bill
        customer.calculateBill();

        // Display Bill
        customer.displayBill();

        input.close();
    }
}
