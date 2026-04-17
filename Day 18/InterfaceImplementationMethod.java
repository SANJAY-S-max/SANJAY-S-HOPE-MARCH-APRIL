
interface Method {

    default void display() {
        System.out.println("Hello from the interface method!");
    }
}

class MethodImpl implements Method {

    public void display() {
        System.out.println("Hello from the implemented method!");
    }
}

public class InterfaceImplementationMethod {

    public static void main(String[] args) {
        MethodImpl obj = new MethodImpl();
        obj.display();
    }
}
