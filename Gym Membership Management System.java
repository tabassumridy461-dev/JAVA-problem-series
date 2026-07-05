import java.util.ArrayList;
import java.util.Scanner;

class Member {

    private int memberId;
    private String name;
    private String membershipType;
    private int duration;
    private double fee;
    private boolean active;

    public Member(int memberId, String name, String membershipType, int duration, double fee) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.duration = duration;
        this.fee = fee;
        active = true;
    }

    public int getMemberId() {
        return memberId;
    }

    public double getFee() {
        return fee;
    }

    public boolean isActive() {
        return active;
    }

    public void cancelMembership() {
        active = false;
    }

    public void displayMember() {
        System.out.println("----------------------------");
        System.out.println("Member ID      : " + memberId);
        System.out.println("Name           : " + name);
        System.out.println("Membership     : " + membershipType);
        System.out.println("Duration       : " + duration + " Month(s)");
        System.out.println("Fee            : $" + fee);
        System.out.println("Status         : " + (active ? "Active" : "Cancelled"));
    }
}

public class GymMembershipManagementSystem {

    static ArrayList<Member> members = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void addMember() {

        System.out.print("Member ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Member Name: ");
        String name = input.nextLine();

        System.out.print("Membership Type: ");
        String type = input.nextLine();

        System.out.print("Duration (Months): ");
        int duration = input.nextInt();

        System.out.print("Membership Fee: ");
        double fee = input.nextDouble();

        members.add(new Member(id, name, type, duration, fee));

        System.out.println("Member added successfully.\n");
    }

    public static void viewMembers() {

        if (members.isEmpty()) {
            System.out.println("No members found.\n");
            return;
        }

        for (Member member : members) {
            member.displayMember();
        }

        System.out.println();
    }

    public static void searchMember() {

        System.out.print("Enter Member ID: ");
        int id = input.nextInt();

        for (Member member : members) {
            if (member.getMemberId() == id) {
                member.displayMember();
                return;
            }
        }

        System.out.println("Member not found.\n");
    }

    public static void cancelMembership() {

        System.out.print("Enter Member ID: ");
        int id = input.nextInt();

        for (Member member : members) {
            if (member.getMemberId() == id) {

                if (member.isActive()) {
                    member.cancelMembership();
                    System.out.println("Membership cancelled.\n");
                } else {
                    System.out.println("Membership already cancelled.\n");
                }

                return;
            }
        }

        System.out.println("Member not found.\n");
    }

    public static void calculateRevenue() {

        double total = 0;

        for (Member member : members) {
            if (member.isActive()) {
                total += member.getFee();
            }
        }

        System.out.println("Total Active Membership Revenue: $" + total + "\n");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("===== Gym Membership Management System =====");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Search Member");
            System.out.println("4. Cancel Membership");
            System.out.println("5. Calculate Revenue");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addMember();
                    break;

                case 2:
                    viewMembers();
                    break;

                case 3:
                    searchMember();
                    break;

                case 4:
                    cancelMembership();
                    break;

                case 5:
                    calculateRevenue();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.\n");
            }

        } while (choice != 6);
    }
}
