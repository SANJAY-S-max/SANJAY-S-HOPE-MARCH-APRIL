import java.util.*;
public class rectPerimeter{
    public static void main(String[] args) {
        int length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        length=sc.nextInt();
        System.out.print("Enter the breadth: ");
        breadth=sc.nextInt();
        System.out.print("The area of the rectangle is: "+(length*breadth));
    }
}