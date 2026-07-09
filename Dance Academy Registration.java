import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String danceStyle;
    private int age;
    private String batch;

    public Student(int id, String name, String danceStyle, int age, String batch) {
        this.id = id;
        this.name = name;
        this.danceStyle = danceStyle;
        this.age = age;
        this.batch = batch;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dance Style: " + danceStyle);
        System.out.println("Age: " + age);
        System.out.println("Batch: " + batch);
        System.out.println();
    }
}

public class DanceAcademyRegistration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("1. Register Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Dance Style: ");
                    String style = input.nextLine();

                    System.out.print("Enter Age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Batch: ");
                    String batch = input.nextLine();

                    students.add(new Student(id, name, style, age, batch));

                    System.out.println("Student registered successfully.\n");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No student registered.\n");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = input.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.getId() == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.\n");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int removeId = input.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId() == removeId) {
                            students.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Student removed successfully.\n");
                    } else {
                        System.out.println("Student not found.\n");
                    }

                    break;

                case 5:

                    System.out.println("Thank you for using Dance Academy Registration System.");
                    input.close();
                    return;

                default:

                    System.out.println("Invalid choice.\n");
            }
        }
    }
}
