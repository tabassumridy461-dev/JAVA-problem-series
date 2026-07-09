import java.util.ArrayList;
import java.util.Scanner;

public class CollegeHostelMessBilling {

    String studentName;
    int meals;
    double costPerMeal;

    CollegeHostelMessBilling(String studentName, int meals, double costPerMeal) {
        this.studentName = studentName;
        this.meals = meals;
        this.costPerMeal = costPerMeal;
    }

    double getBill() {
        return meals * costPerMeal;
    }

    void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Meals        : " + meals);
        System.out.println("Cost/Meal    : " + costPerMeal);
        System.out.println("Total Bill   : " + getBill());
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<CollegeHostelMessBilling> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Bills");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student Name: ");
                    String name = input.nextLine();

                    System.out.print("Number of Meals: ");
                    int meals = input.nextInt();

                    System.out.print("Cost Per Meal: ");
                    double cost = input.nextDouble();

                    students.add(new CollegeHostelMessBilling(name, meals, cost));

                    System.out.println("Student Added.");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Records Found.");
                    } else {

                        double totalBill = 0;

                        for (CollegeHostelMessBilling student : students) {
                            student.display();
                            totalBill += student.getBill();
                            System.out.println();
                        }

                        System.out.println("Total Students: " + students.size());
                        System.out.println("Total Bill: " + totalBill);
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
