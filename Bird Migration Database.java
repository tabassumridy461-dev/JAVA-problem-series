import java.util.ArrayList;
import java.util.Scanner;

public class BirdMigrationDatabase {

    String birdName;
    String location;
    int distance;
    String season;

    BirdMigrationDatabase(String birdName, String location, int distance, String season) {
        this.birdName = birdName;
        this.location = location;
        this.distance = distance;
        this.season = season;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Bird Name          : " + birdName);
        System.out.println("Migration Location : " + location);
        System.out.println("Distance (Km)      : " + distance);
        System.out.println("Season             : " + season);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<BirdMigrationDatabase> records = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Bird Migration Database =====");
            System.out.println("1. Add Bird Record");
            System.out.println("2. View All Records");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Bird Name: ");
                    String bird = input.nextLine();

                    System.out.print("Enter Migration Location: ");
                    String location = input.nextLine();

                    System.out.print("Enter Migration Distance (Km): ");
                    int distance = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Season: ");
                    String season = input.nextLine();

                    records.add(new BirdMigrationDatabase(bird, location, distance, season));

                    System.out.println("Bird Record Added Successfully.");
                    break;

                case 2:

                    if (records.isEmpty()) {
                        System.out.println("No Records Found.");
                    } else {

                        int totalDistance = 0;

                        System.out.println("\n===== Bird Migration Records =====");

                        for (BirdMigrationDatabase record : records) {
                            record.display();
                            totalDistance += record.distance;
                        }

                        System.out.println("--------------------------------");
                        System.out.println("Total Birds          : " + records.size());
                        System.out.println("Total Distance (Km)  : " + totalDistance);
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
