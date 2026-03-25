import java.util.*;
public class Factorial{
    public static int fact(int num){
        if(num==0 || num==1)
            return 1;
        else
            return num*fact(num-1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=input.nextInt();
        int result=fact(num);
        System.out.println("The factorial of "+num+" is "+result+".");
    }
}
