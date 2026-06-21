public class Recursion {

    // Recursive method to calculate the sum of numbers from 1 to k
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int result = sum(10);

        System.out.println("Sum of numbers from 1 to 10 = " + result);
    }
}
