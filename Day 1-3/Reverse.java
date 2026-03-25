import java.util.*;
public class Reverse{
    public static int reverse(int num,int rev){
        if(num==0)
            return rev;
        else{
            
            rev=rev*10+num%10;
            return reverse(num/10,rev);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=input.nextInt();
        int rev=0;
        System.out.println(reverse(num,rev));
    }
}