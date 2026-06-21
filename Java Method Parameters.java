public class MethodParameters {

    // Method with one parameter
    static void printFullName(String fname) {
        System.out.println(fname + " Refsnes");
    }

    // Method with multiple parameters
    static void printPersonInfo(String fname, int age) {
        System.out.println(fname + " is " + age + " years old");
    }

    public static void main(String[] args) {

        // Single parameter examples
        System.out.println("=== Single Parameter ===");
        printFullName("Liam");
        printFullName("Jenny");
        printFullName("Anja");

        // Multiple parameter examples
        System.out.println("\n=== Multiple Parameters ===");
        printPersonInfo("Liam", 5);
        printPersonInfo("Jenny", 8);
        printPersonInfo("Anja", 31);
    }
}
