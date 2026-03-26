// Parent class
class SuperExample1 {
    int x;

    // Parent constructor
    SuperExample1() {
        x = 10;
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Value of x in parent: " + x);
    }
}

// Child class
class SuperExample2 extends SuperExample1 {
    int y;

    // Child constructor
    SuperExample2() {
        super(); // Calls parent constructor explicitly (optional if default)
        y = 20;
        System.out.println("Child constructor called");
    }

    void display() {
        super.display(); // Calls parent display method
        System.out.println("Value of y in child: " + y);
    }

    void showValues() {
        System.out.println("Parent x using super: " + super.x); // Access parent field
        System.out.println("Child y: " + y);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        // Creating object of child class
        SuperExample2 obj = new SuperExample2();

        System.out.println("\nCalling child display method:");
        obj.display(); // calls child display, which also calls parent display

        System.out.println("\nAccessing parent field using super:");
        obj.showValues();
    }
}