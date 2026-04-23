import java.util.Scanner;

public class constructor_001 {

    void cons() {
        System.out.println("This is a method");
    }
    constructor_001() // default constructor
    {
        System.out.println("This is a constructor...");
    }
    constructor_001 (int a) // parameterized constructor
    {
        System.out.println("This is a parameterized constructor...");
    }   

    public static void main(String[] args) {
        System.out.println("obj c1: ");
        constructor_001 c1 = new constructor_001(); // object creation-- default constructor will be called
        c1.cons(); //method calling
        System.out.println("obj c2: ");
        constructor_001 c2 = new constructor_001(5); // object creation-- paramereterized constructor will be called
        c2.cons();
        System.out.println("obj c3: ");
        constructor_001 c3 = new constructor_001();

    }
}