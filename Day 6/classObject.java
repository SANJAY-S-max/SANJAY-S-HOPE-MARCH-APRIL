class apartment {
    void display() {
        System.out.println("I am inside the apartment class");
    }
}

public class classObject {
    public static void main(String[] args) {
        // creating an object of the class
        System.out.println("I am inside the class object");
        apartment myApartment = new apartment();
        myApartment.display();
    }
}