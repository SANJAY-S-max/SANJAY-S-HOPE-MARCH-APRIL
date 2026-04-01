import java.util.*;

public class throwException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            throw new ArithmeticException("Age must be at least 18");       
        }else{
            System.out.println("Age is valid");
        }
    }
}