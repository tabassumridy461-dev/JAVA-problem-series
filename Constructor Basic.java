/* Constructor হলো Java-এর একটি বিশেষ method, যা object তৈরি হওয়ার সাথে সাথে automatically call হয়।

এর প্রধান কাজ হলো object-এর initial value set করা (initialize করা)। */

public class Student {

    String name; // এগুলো হলো instance variable (object-এর variable)।
    int age;

    // Constructor
    public Student(String name, int age) { // এখানে name এবং age হলো parameter।
        this.name = name; /* this.name = Object-এর variable , name = Constructor-এর parameter 
        this.age = age;       Object-এর name variable-এ parameter-এর name value রাখো। */

    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ridy", 22);

        s1.display();

    }
}
