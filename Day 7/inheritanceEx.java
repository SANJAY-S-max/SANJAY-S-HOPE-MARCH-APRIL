class animal{
    void display(){
        System.out.println("ther are multiple animals");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("dog barks");
    }
}

public class inheritanceEx {
    public static void main(String[] args) {
        dog sound = new dog();
        sound.display();
        sound.bark();
        System.out.println(sound.hashCode());
    }    
}
