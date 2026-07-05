import java.util.ArrayList;
import java.util.Scanner;

class Booking {

    private int bookingId;
    private String customerName;
    private String serviceType;
    private String bookingDate;
    private double price;
    private boolean completed;

    public Booking(int bookingId, String customerName, String serviceType,
                   String bookingDate, double price) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.bookingDate = bookingDate;
        this.price = price;
        completed = false;
    }

    public int getBookingId() {
        return bookingId;
    }

    public double getPrice() {
        return price;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeService() {
        completed = true;
    }

    public void displayBooking() {
        System.out.println("-------------------------------");
        System.out.println("Booking ID    : " + bookingId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Service Type  : " + serviceType);
        System.out.println("Booking Date  : " + bookingDate);
        System.out.println("Price         : $" + price);
        System.out.println("Status        : " + (completed ? "Completed" : "Pending"));
    }
}

public class HomeCleaningServiceBooking {

    static ArrayList<Booking> bookings = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void addBooking() {

        System.out.print("Booking ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Customer Name: ");
        String name = input.nextLine();

        System.out.print("Service Type: ");
        String service = input.nextLine();

        System.out.print("Booking Date: ");
        String date = input.nextLine();

        System.out.print("Service Price: ");
        double price = input.nextDouble();

        bookings.add(new Booking(id, name, service, date, price));

        System.out.println("Booking added successfully.\n");
    }

    public static void viewBookings() {

        if (bookings.isEmpty()) {
            System.out.println("No bookings available.\n");
            return;
        }

        for (Booking booking : bookings) {
            booking.displayBooking();
        }

        System.out.println();
    }

    public static void searchBooking() {

        System.out.print("Enter Booking ID: ");
        int id = input.nextInt();

        for (Booking booking : bookings) {
            if (booking.getBookingId() == id) {
                booking.displayBooking();
                return;
            }
        }

        System.out.println("Booking not found.\n");
    }

    public static void completeBooking() {

        System.out.print("Enter Booking ID: ");
        int id = input.nextInt();

        for (Booking booking : bookings) {

            if (booking.getBookingId() == id) {

                if (!booking.isCompleted()) {
                    booking.completeService();
                    System.out.println("Service marked as completed.\n");
                } else {
                    System.out.println("Service already completed.\n");
                }

                return;
            }
        }

        System.out.println("Booking not found.\n");
    }

    public static void calculateIncome() {

        double total = 0;

        for (Booking booking : bookings) {
            total += booking.getPrice();
        }

        System.out.println("Total Income: $" + total + "\n");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("===== Home Cleaning Service Booking =====");
            System.out.println("1. Add Booking");
            System.out.println("2. View Bookings");
            System.out.println("3. Search Booking");
            System.out.println("4. Complete Service");
            System.out.println("5. Calculate Total Income");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addBooking();
                    break;

                case 2:
                    viewBookings();
                    break;

                case 3:
                    searchBooking();
                    break;

                case 4:
                    completeBooking();
                    break;

                case 5:
                    calculateIncome();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.\n");
            }

        } while (choice != 6);
    }
}
