// Parent Class
class Animal {

    // Parent Method
    public void sound() {
        System.out.println("Animal makes sound");
    }

}

// Child Class 1
class Dog extends Animal {

    // Method Overriding
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

}

// Child Class 2
class Cat extends Animal {

    // Method Overriding
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

}

// Main Class
public class Main {

    public static void main(String[] args) {

        Animal a1 = new Dog();  // Animal → Reference Type (বাম পাশে)  new Dog() → আসল Object (ডান পাশে)
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();

    }

}


// explanation 

class Dog extends Animal {

    public void sound() {
        System.out.println("Dog barks");
    }

    public void run() {
        System.out.println("Dog is running");
    }

}

/* Animal a1 = new Dog();
   a1.run(); */
/* ❌ Error : কারণ Animal class-এ run() নামে কোনো Method নেই।

Reference Type Animal, তাই compiler শুধু Animal-এর Method-গুলোই দেখতে পায়। */

/* Dog d = new Dog();

d.run();

তাহলে,

✅ Output:

Dog is running */
