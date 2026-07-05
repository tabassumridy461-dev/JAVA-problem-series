import java.util.ArrayList;
import java.util.Scanner;

class Pet {
    private int id;
    private String name;
    private String type;
    private int age;
    private boolean adopted;

    public Pet(int id, String name, String type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        adopted = false;
    }

    public int getId() {
        return id;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void adopt() {
        adopted = true;
    }

    public void display() {
        System.out.println("----------------------------");
        System.out.println("Pet ID   : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Type     : " + type);
        System.out.println("Age      : " + age + " year(s)");
        System.out.println("Status   : " + (adopted ? "Adopted" : "Available"));
    }
}

public class PetAdoptionCenter {

    static ArrayList<Pet> pets = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void addPet() {
        System.out.print("Pet ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Pet Name: ");
        String name = input.nextLine();

        System.out.print("Pet Type: ");
        String type = input.nextLine();

        System.out.print("Pet Age: ");
        int age = input.nextInt();

        pets.add(new Pet(id, name, type, age));
        System.out.println("Pet added successfully.\n");
    }

    public static void viewPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets found.\n");
            return;
        }

        for (Pet pet : pets) {
            pet.display();
        }
        System.out.println();
    }

    public static void adoptPet() {
        System.out.print("Enter Pet ID to adopt: ");
        int id = input.nextInt();

        for (Pet pet : pets) {
            if (pet.getId() == id) {
                if (!pet.isAdopted()) {
                    pet.adopt();
                    System.out.println("Pet adopted successfully.\n");
                } else {
                    System.out.println("This pet is already adopted.\n");
                }
                return;
            }
        }

        System.out.println("Pet not found.\n");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("===== Pet Adoption Center =====");
            System.out.println("1. Add Pet");
            System.out.println("2. View Pets");
            System.out.println("3. Adopt Pet");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addPet();
                    break;

                case 2:
                    viewPets();
                    break;

                case 3:
                    adoptPet();
                    break;

                case 4:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice.\n");
            }

        } while (choice != 4);
    }
}
