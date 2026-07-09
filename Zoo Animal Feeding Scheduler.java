import java.util.ArrayList;
import java.util.Scanner;

public class ZooAnimalFeedingScheduler {

    String animalName;
    String foodType;
    String feedingTime;
    int foodQuantity;

    ZooAnimalFeedingScheduler(String animalName, String foodType,
                              String feedingTime, int foodQuantity) {
        this.animalName = animalName;
        this.foodType = foodType;
        this.feedingTime = feedingTime;
        this.foodQuantity = foodQuantity;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Animal Name   : " + animalName);
        System.out.println("Food Type     : " + foodType);
        System.out.println("Feeding Time  : " + feedingTime);
        System.out.println("Food Quantity : " + foodQuantity + " Kg");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<ZooAnimalFeedingScheduler> schedule = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Zoo Animal Feeding Scheduler =====");
            System.out.println("1. Add Feeding Schedule");
            System.out.println("2. View Feeding Schedule");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Animal Name: ");
                    String animal = input.nextLine();

                    System.out.print("Enter Food Type: ");
                    String food = input.nextLine();

                    System.out.print("Enter Feeding Time: ");
                    String time = input.nextLine();

                    System.out.print("Enter Food Quantity (Kg): ");
                    int quantity = input.nextInt();

                    schedule.add(new ZooAnimalFeedingScheduler(animal, food, time, quantity));

                    System.out.println("Feeding Schedule Added Successfully.");
                    break;

                case 2:

                    if (schedule.isEmpty()) {
                        System.out.println("No Feeding Schedule Found.");
                    } else {

                        int totalFood = 0;

                        System.out.println("\n===== Feeding Schedule =====");

                        for (ZooAnimalFeedingScheduler record : schedule) {
                            record.display();
                            totalFood += record.foodQuantity;
                        }

                        System.out.println("--------------------------------");
                        System.out.println("Total Animals : " + schedule.size());
                        System.out.println("Total Food    : " + totalFood + " Kg");
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
