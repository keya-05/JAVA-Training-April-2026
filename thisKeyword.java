import java.util.Scanner;

public class thisKeyword {
    int id; //istantiated variable = class variable
    float marks;
    String name;

    thisKeyword(int id, float marks, String name) // parameterized constructor
    {
        this.id = id; //this.class variable= parameter variable
        this.marks = marks; 
        this.name = name;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        
        thisKeyword s1 = new thisKeyword(101, 85.5f, "Keya");
        s1.display();
        System.out.println("------------------------------");
        thisKeyword s2= new thisKeyword(102, 90.1f, "Ridhu");
        s2.display();
        System.out.println("------------------------------");
    }
}