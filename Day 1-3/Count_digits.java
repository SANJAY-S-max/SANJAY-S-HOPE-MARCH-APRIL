import java.util.*;
public class Count_digits{
    public static int countDigits(int num,int count){
        if(num==0)
            return count;
        else{
            count++;
            return countDigits(num/10,count);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=input.nextInt();
        int count=0;
        int result=countDigits(num,count);
        System.out.println("Number of digits in "+num+" is "+result+".");
    }
}