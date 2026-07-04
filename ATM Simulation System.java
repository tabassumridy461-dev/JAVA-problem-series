import java.util.Scanner;

public class ATMSimulation {

    // Account Information
    private String accountHolder;
    private int pin;
    private double balance;

    // Constructor
    public ATMSimulation(String accountHolder, int pin, double balance) {
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = balance;
    }

    // Check PIN
    public boolean login(int enteredPin) {
        return enteredPin == pin;
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("\nCurrent Balance: $" + balance);
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful!");
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Withdraw Money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: $" + balance);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create Account
        ATMSimulation account = new ATMSimulation("John", 1234, 1000);

        System.out.println("=================================");
        System.out.println("      ATM SIMULATION SYSTEM");
        System.out.println("=================================");

        // Login
        System.out.print("Enter PIN: ");
        int enteredPin = input.nextInt();

        if (!account.login(enteredPin)) {
            System.out.println("Incorrect PIN!");
            input.close();
            return;
        }

        System.out.println("\nLogin Successful!");
        System.out.println("Welcome " + account.accountHolder);

        int choice;

        do {
            System.out.println("\n========= ATM MENU =========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = input.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = input.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("\nThank you for using our ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        input.close();
    }
}
