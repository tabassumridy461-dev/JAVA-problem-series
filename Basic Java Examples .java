// Java Basic problems

public class Main {

    // Method (Function)
    static void greet() {
        System.out.println("Welcome to My Java Project!");
    }

    public static void main(String[] args) {

        // 1. Print Output
        System.out.println("Hello World");

        // 2. Variable
        int age = 20;
        System.out.println("Age = " + age);

        // 3. Addition
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum = " + sum);

        // 4. If-Else
        int marks = 80;

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // 5. For Loop
        System.out.println("Loop Output:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 6. Array
        int[] numbers = {10, 20, 30};

        System.out.println("Array Values:");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // 7. Method Call
        greet();
    }
}
