// Parent class (Super class)
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }

    void sleep() {
        System.out.println("This animal sleeps");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Inherited methods
        d.eat();
        d.sleep();

        // Child class method
        d.bark();
    }
}
