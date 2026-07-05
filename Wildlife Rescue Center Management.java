import java.util.ArrayList;
import java.util.Scanner;

class Animal {

    private int rescueId;
    private String animalName;
    private String species;
    private String rescueLocation;
    private String healthStatus;

    public Animal(int rescueId, String animalName, String species,
                  String rescueLocation, String healthStatus) {

        this.rescueId = rescueId;
        this.animalName = animalName;
        this.species = species;
        this.rescueLocation = rescueLocation;
        this.healthStatus = healthStatus;
    }

    public int getRescueId() {
        return rescueId;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void display() {

        System.out.println("-------------------------------");
        System.out.println("Rescue ID      : " + rescueId);
        System.out.println("Animal Name    : " + animalName);
        System.out.println("Species        : " + species);
        System.out.println("Rescue Location: " + rescueLocation);
        System.out.println("Health Status  : " + healthStatus);
    }
}

public class WildlifeRescueCenterManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Wildlife Rescue Center =====");
            System.out.println("1. Register Rescued Animal");
            System.out.println("2. View All Animals");
            System.out.println("3. Update Health Status");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Rescue ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Animal Name: ");
                    String name = sc.nextLine();

                    System.out.print("Species: ");
                    String species = sc.nextLine();

                    System.out.print("Rescue Location: ");
                    String location = sc.nextLine();

                    System.out.print("Health Status: ");
                    String status = sc.nextLine();

                    animals.add(new Animal(id, name, species, location, status));

                    System.out.println("Animal registered successfully.");
                    break;

                case 2:

                    if (animals.isEmpty()) {
                        System.out.println("No rescued animals found.");
                    } else {

                        for (Animal animal : animals) {
                            animal.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Rescue ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (Animal animal : animals) {

                        if (animal.getRescueId() == searchId) {

                            System.out.print("New Health Status: ");
                            String newStatus = sc.nextLine();

                            animal.setHealthStatus(newStatus);

                            System.out.println("Health status updated successfully.");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Animal not found.");
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
