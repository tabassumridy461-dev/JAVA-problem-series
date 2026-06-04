// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("This animal sleeps");
    }
}

// Child class
class Dog extends Animal {

    // Providing implementation of abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();   // abstract method implementation
        d.sleep();   // normal method
    }
}
