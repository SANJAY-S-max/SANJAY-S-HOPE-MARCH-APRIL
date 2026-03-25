import java.util.*;
public class Adams_number {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int res=adamsNumber(num);
        if(res==0)
            System.out.println("Adams Number");
        else
            System.out.println("Not Adams Number");
    }
    public static int adamsNumber(int num){
        int sqOfnum=num*num;
        int revNum=0;
        while(num!=0)
        {
            int dig=num%10;
            revNum=revNum*10+dig;
            num=num/10;
        }
        int sqOfrevNum=revNum*revNum;
        int rev_sqOfrevNum=0;
        while(sqOfrevNum!=0)
        {
            int dig=sqOfrevNum%10;
            rev_sqOfrevNum=rev_sqOfrevNum*10+dig;
            sqOfrevNum/=10;
        }
        if(sqOfnum==rev_sqOfrevNum)
            return 0;
        else
            return 1;


    }
}
