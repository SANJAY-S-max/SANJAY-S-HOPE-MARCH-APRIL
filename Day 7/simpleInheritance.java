class parent{
    void display(){
        System.out.println("This is the parent class");
    }
}

class child extends parent{
    void display1(){
        System.out.println("This is the child class");
    }
}

public class simpleInheritance {
    public static void main(String[] args) {
        child child = new child();
        child.display();
    }
}
