class Calculator {

    // Method with 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(5.5, 4.5));
    }
}
