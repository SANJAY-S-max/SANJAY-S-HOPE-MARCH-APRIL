interface CarEngine{
    static void start(){
        System.out.println("Car engine started");
    }
}

public class StaticInterfaceImplementation {
    public static void main(String[] args){
        CarEngine.start();
    }    
}
