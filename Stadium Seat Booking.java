import java.util.ArrayList;
import java.util.Scanner;

public class StadiumSeatBooking {

    String customerName;
    String eventName;
    int seatNumber;
    double ticketPrice;

    StadiumSeatBooking(String customerName, String eventName, int seatNumber, double ticketPrice) {
        this.customerName = customerName;
        this.eventName = eventName;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Event Name    : " + eventName);
        System.out.println("Seat Number   : " + seatNumber);
        System.out.println("Ticket Price  : " + ticketPrice);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<StadiumSeatBooking> bookings = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Book Seat");
            System.out.println("2. View Bookings");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Customer Name: ");
                    String customer = input.nextLine();

                    System.out.print("Event Name: ");
                    String event = input.nextLine();

                    System.out.print("Seat Number: ");
                    int seat = input.nextInt();

                    System.out.print("Ticket Price: ");
                    double price = input.nextDouble();

                    bookings.add(new StadiumSeatBooking(customer, event, seat, price));

                    System.out.println("Seat Booked.");
                    break;

                case 2:

                    if (bookings.isEmpty()) {
                        System.out.println("No Bookings Found.");
                    } else {

                        double totalPrice = 0;

                        for (StadiumSeatBooking booking : bookings) {
                            booking.display();
                            totalPrice += booking.ticketPrice;
                            System.out.println();
                        }

                        System.out.println("Total Bookings: " + bookings.size());
                        System.out.println("Total Ticket Price: " + totalPrice);
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
