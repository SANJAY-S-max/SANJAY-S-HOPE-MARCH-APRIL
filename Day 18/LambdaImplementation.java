import java.util.*;
public class LambdaImplementation {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            for(int i=0;i<5;i++){
                System.out.println("Hello "+i);
            }
        };
            
        Thread t = new Thread(r);
        t.start();
        t.join();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach((n) -> {System.out.println(n);});
    }    
}
