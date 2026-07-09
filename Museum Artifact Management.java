import java.util.ArrayList;
import java.util.Scanner;

public class MuseumArtifactManagement {

    String artifactName;
    String category;
    int year;
    String location;

    MuseumArtifactManagement(String artifactName, String category, int year, String location) {
        this.artifactName = artifactName;
        this.category = category;
        this.year = year;
        this.location = location;
    }

    void display() {
        System.out.println("Artifact Name : " + artifactName);
        System.out.println("Category      : " + category);
        System.out.println("Year          : " + year);
        System.out.println("Location      : " + location);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<MuseumArtifactManagement> artifacts = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Artifact");
            System.out.println("2. View Artifacts");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Artifact Name: ");
                    String name = input.nextLine();

                    System.out.print("Category: ");
                    String category = input.nextLine();

                    System.out.print("Year: ");
                    int year = input.nextInt();
                    input.nextLine();

                    System.out.print("Location: ");
                    String location = input.nextLine();

                    artifacts.add(new MuseumArtifactManagement(name, category, year, location));

                    System.out.println("Artifact Added.");
                    break;

                case 2:

                    if (artifacts.isEmpty()) {
                        System.out.println("No Artifacts Found.");
                    } else {

                        for (MuseumArtifactManagement artifact : artifacts) {
                            artifact.display();
                            System.out.println();
                        }

                        System.out.println("Total Artifacts: " + artifacts.size());
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
