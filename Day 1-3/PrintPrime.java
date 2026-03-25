import java.util.*;
public class PrintPrime{
    public static void primeCheck(int num){ 
        int flag=0;
        for(int ind=2;ind<=(int)Math.sqrt(num);ind++){
            if(num%ind==0){
                flag=1;
                break;
            }
        }
        if(flag==0 && num>1)
            System.out.print(num+" ");
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Start Value:");
        int start=input.nextInt();
        System.out.println("Enter End Value:");
        int end=input.nextInt();
        for(int num=start;num<=end;num++){
            primeCheck(num);
        }
    }
}
