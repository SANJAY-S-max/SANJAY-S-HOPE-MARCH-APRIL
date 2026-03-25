class crOverloading{
    crOverloading() {
        System.out.println("This is default constructor");
    }
    crOverloading(int a) {
        System.out.println("This is parameterized constructor with one parameter");
    }
    crOverloading(String str) {
        System.out.println("This is parameterized constructor with one String parameter");
    }
}

public class constructorOverloading {
    public static void main(String[] args) {
        System.out.println("constructor Overloading");
        //Before creating objects, the JVM loads the class crOverloading into memory using a class loader.
        crOverloading cr1 = new crOverloading();                    //default constructor with no parameter
        crOverloading cr2 = new crOverloading(5);                //parameterized constructor with one parameter
        crOverloading cr3 = new crOverloading("Hello");        //parameterized constructor with one String parameter
    }
}