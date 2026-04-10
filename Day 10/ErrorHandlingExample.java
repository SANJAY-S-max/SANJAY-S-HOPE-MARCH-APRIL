import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ErrorDemo {

    // Method to divide two numbers → can throw ArithmeticException (unchecked)
    public int divide(int a, int b) {
        return a / b; //(may throw ArithmeticException)
    }

    // Method to access array → can throw ArrayIndexOutOfBoundsException (unchecked)
    public int getArrayValue(int[] arr, int index) {
        return arr[index]; //(may throw ArrayIndexOutOfBoundsException)
    }

    // Method to read file → throws FileNotFoundException (checked)
    public void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file); //(may throw FileNotFoundException)
        System.out.println("First line: " + sc.nextLine());
        sc.close();
    }

    // Method demonstrating throw → manually throws exception
    public void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above"); //(manual exception)
        }
        System.out.println("Age is valid: " + age);
    }
}

public class ErrorHandlingExample {
    public static void main(String[] args) {

        ErrorDemo demo = new ErrorDemo();

        // 1️⃣ Handling ArithmeticException
        try {
            System.out.println("Division result: " + demo.divide(10, 0)); //(risky division)
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!"); //(handling exception)
        } finally {
            System.out.println("Finished division check"); //(always runs)
        }

        System.out.println("----------------------");

        // 2️⃣ Handling ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Array value: " + demo.getArrayValue(numbers, 5)); //(risky array access)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!"); //(handling exception)
        } finally {
            System.out.println("Finished array check"); //(always runs)
        }

        System.out.println("----------------------");

        // 3️⃣ Handling Checked Exception → FileNotFoundException
        try {
            demo.readFile("notExist.txt"); //(may throw FileNotFoundException)
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!"); //(handling checked exception)
        } finally {
            System.out.println("Finished file read attempt"); //(always runs)
        }

        System.out.println("----------------------");

        // 4️⃣ Handling manually thrown exception
        try {
            demo.checkAge(15); //(may throw IllegalArgumentException)
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); //(handling manual exception)
        } finally {
            System.out.println("Finished age check"); //(always runs)
        }

        System.out.println("----------------------");

        // 5️⃣ Combining multiple risky operations
        try {
            demo.divide(20, 0); //(ArithmeticException)
            demo.getArrayValue(numbers, 10); //(ArrayIndexOutOfBoundsException)
            demo.readFile("notExist.txt"); //(FileNotFoundException)
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException!");
        } finally {
            System.out.println("Finished combined checks"); //(always runs)
        }

        System.out.println("Program continues safely..."); //(program did not crash)
    }
}