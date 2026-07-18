/* Encapsulation  কী? data hide rakha getter / setter diye access diya 
private → Variable-এর জন্য ব্যবহার করি।
public getter → Variable-এর Value দেখার জন্য।
public setter → Variable-এর Value পরিবর্তনের জন্য। */

// Student Class
class Student {

    // private variable (সরাসরি বাইরে থেকে Access করা যাবে না)
    private String name; // Instance Variable (Class Variable) , object er variable 
    private int age;

    // Setter Method (Value Set করার জন্য)
    public void setName(String name) {
        this.name = name;
    }
  /* this.name → বর্তমান Object-এর Instance Variable 
name → Setter Method-এর Parameter (Local Variable) */

    public void setAge(int age) {
        this.age = age;
    }

    // Getter Method (Value দেখার জন্য)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Object তৈরি
        Student s1 = new Student();

        // Setter দিয়ে Value দেওয়া
        s1.setName("Tabassum");
        s1.setAge(22);

        // Getter দিয়ে Value নেওয়া
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

    }
}
