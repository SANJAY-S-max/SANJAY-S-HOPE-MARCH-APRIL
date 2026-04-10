
public class ArithmaticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b; // may throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("Program continues...");
    }
}
