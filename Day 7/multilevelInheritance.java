class grandParent {
    void display() {
        System.out.println("I am a grandparent.");
    }
}

class parent extends grandParent {
    void display1() {
        System.out.println("I am a parent.");
    }
}

class child extends parent {
    void display2() {
        System.out.println("I am a child.");
    }
}


public class multilevelInheritance {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.display1();
        c.display2();
    }
}
