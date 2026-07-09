import java.util.ArrayList;
import java.util.Scanner;

public class PersonalSavingsTracker {

    String source;
    double amount;
    String date;

    PersonalSavingsTracker(String source, double amount, String date) {
        this.source = source;
        this.amount = amount;
        this.date = date;
    }

    void display() {
        System.out.println("Source : " + source);
        System.out.println("Amount : " + amount);
        System.out.println("Date   : " + date);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<PersonalSavingsTracker> savings = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Savings");
            System.out.println("2. View Savings");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Source: ");
                    String source = input.nextLine();

                    System.out.print("Amount: ");
                    double amount = input.nextDouble();
                    input.nextLine();

                    System.out.print("Date: ");
                    String date = input.nextLine();

                    savings.add(new PersonalSavingsTracker(source, amount, date));

                    System.out.println("Savings Added.");
                    break;

                case 2:

                    if (savings.isEmpty()) {
                        System.out.println("No Savings Found.");
                    } else {

                        double totalSavings = 0;

                        for (PersonalSavingsTracker saving : savings) {
                            saving.display();
                            totalSavings += saving.amount;
                            System.out.println();
                        }

                        System.out.println("Total Entries: " + savings.size());
                        System.out.println("Total Savings: " + totalSavings);
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
