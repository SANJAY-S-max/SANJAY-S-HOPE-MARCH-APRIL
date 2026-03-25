import java.util.*;
public class subwaySurfers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the obstacle: ");
        String obstacle = sc.nextLine();

        if (obstacle.equals("Train")) {
            System.out.println("Slide left or right!");
        } 
        else if (obstacle.equals("Short barrier")) {
            System.out.println("Jump or swipe down");
        }
        else if (obstacle.equals("Long barrier")) {
            System.out.println("Jump or swipe down");
        } 
        else {
            System.out.println("Keep running!");
        }
    }
}