import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowThrowsCombined {

    // This method declares it may throw FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        System.out.println("First line: " + sc.nextLine());
        sc.close();
    }

    // This method throws exception manually
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
        System.out.println("Age valid: " + age);
    }

    public static void main(String[] args) {
        try {
            readFile("missing.txt");   // checked exception
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException");
        }

        try {
            checkAge(15);             // unchecked exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}