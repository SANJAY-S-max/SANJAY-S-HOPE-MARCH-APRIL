interface MyInterface {
    void myMethod();
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        // MyInterface obj = new MyInterface(); // Error: Cannot instantiate the interface
        // MyInterface obj = new MyInterface() {
        //     @Override
        //     public void myMethod() {
        //         System.out.println("Hello from the anonymous class!");
        //     }
        // };
        // obj.myMethod();
        MyInterface obj = () -> {
            System.out.println("Hello from the lambda expression!");
        };
        obj.myMethod();
    }    
}
