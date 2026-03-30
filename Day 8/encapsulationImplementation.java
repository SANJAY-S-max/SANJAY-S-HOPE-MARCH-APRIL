import java.util.*;

class Encapsulation {
    private int a;

    Encapsulation() {
        a = 10;
    }

    public int getA() {
        return a;
    }

    public void setA(int value) {
        if (value > 0) { 
            a = value;
        } else {
            System.out.println("Invalid value!");
        }
    }

    public void display() {
        System.out.println("Implementing encapsulation: " + a);
    }
}

public class encapsulationImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Encapsulation obj = new Encapsulation();

        System.out.print("Enter a new value for a: ");
        int value = sc.nextInt();
        obj.setA(value);

        obj.display();

        System.out.println("Accessing using getter: " + obj.getA());
    }
}