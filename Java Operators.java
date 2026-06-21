public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Assignment Operators
        int x = 10;
        x += 5;
        System.out.println("\nAssignment Operators:");
        System.out.println("x += 5 -> " + x);

        // Comparison Operators
        System.out.println("\nComparison Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));

        // Logical Operators
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("\nLogical Operators:");
        System.out.println("isJavaFun && isFishTasty = " + (isJavaFun && isFishTasty));
        System.out.println("isJavaFun || isFishTasty = " + (isJavaFun || isFishTasty));
        System.out.println("!isJavaFun = " + (!isJavaFun));

        // Bitwise Operators
        int num1 = 5; // 0101
        int num2 = 3; // 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("num1 & num2 = " + (num1 & num2));
        System.out.println("num1 | num2 = " + (num1 | num2));
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));
    }
}
