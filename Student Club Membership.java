import java.util.ArrayList;
import java.util.Scanner;

public class StudentClubMembership {

    String studentName;
    String studentId;
    String clubName;
    double membershipFee;

    StudentClubMembership(String studentName, String studentId, String clubName, double membershipFee) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.clubName = clubName;
        this.membershipFee = membershipFee;
    }

    void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Club Name    : " + clubName);
        System.out.println("Fee          : " + membershipFee);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<StudentClubMembership> members = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student Name: ");
                    String name = input.nextLine();

                    System.out.print("Student ID: ");
                    String id = input.nextLine();

                    System.out.print("Club Name: ");
                    String club = input.nextLine();

                    System.out.print("Membership Fee: ");
                    double fee = input.nextDouble();

                    members.add(new StudentClubMembership(name, id, club, fee));

                    System.out.println("Member Added.");
                    break;

                case 2:

                    if (members.isEmpty()) {
                        System.out.println("No Members Found.");
                    } else {

                        double totalFee = 0;

                        for (StudentClubMembership member : members) {
                            member.display();
                            totalFee += member.membershipFee;
                            System.out.println();
                        }

                        System.out.println("Total Members: " + members.size());
                        System.out.println("Total Membership Fee: " + totalFee);
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
