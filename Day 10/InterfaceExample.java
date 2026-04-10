// Interface 1
interface Animal {
    int AGE = 5; // public static final by default

    void sound(); // abstract method

    // default method
    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    // static method
    static void info() {
        System.out.println("Animals are living beings");
    }
}

// Interface 2
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {

    // implementing abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // implementing second interface method
    @Override
    public void play() {
        System.out.println("Dog plays with ball");
    }

    // overriding default method (optional)
    @Override
    public void sleep() {
        System.out.println("Dog sleeps in kennel");
    }
}

// Another class implementing interface
class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        // ❌ Cannot create interface object
        // Animal a = new Animal(); // ERROR

        // ✅ Interface reference + class object
        Animal a1 = new Dog();
        a1.sound();   // Dog method
        a1.sleep();   // overridden method

        System.out.println("----------------");

        Animal a2 = new Cat();
        a2.sound();   // Cat method
        a2.sleep();   // default method

        System.out.println("----------------");

        // Access static method
        Animal.info();

        System.out.println("----------------");

        // Access constant
        System.out.println("Animal age: " + Animal.AGE);

        System.out.println("----------------");

        // Using second interface
        Pet p = new Dog();
        p.play();
    }
}