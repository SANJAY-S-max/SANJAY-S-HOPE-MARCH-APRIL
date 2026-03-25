import java.util.*;
public class mathOperations{
    public static void main(String[] args) {
        int a,b;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the value of a: ");
        a=sc.nextInt();
        System.out.println();
        System.out.print("Enter the value of b: ");
        b=sc.nextInt();
        System.out.println();
        System.out.print("Enter the operation to be done: ");
        op=sc.next().charAt(0);
        System.out.println();
        switch(op){
            case '+':
                System.out.print("The sum of a & b is "+(a+b));
                break;
            case '-':
                System.out.print("The diff. of a & b is "+(a-b));
                break;
            case '*':
                System.out.print("The pdt. of a & b is "+(a*b));
                break;
            case '/':
                System.out.print("The div. of a by b is "+(a/b));
                break;
            case '%':
                System.out.print("The mod. of a by b is "+(a%b));
                break;
        }
        System.out.println();
    }
}