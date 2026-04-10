public class CharacterMethodsDemo {
    public static void main(String[] args) {
        char c1 = '9';
        char c2 = 'a';
        char c3 = 'G';

        // Checking character type
        System.out.println(c1 + " is digit? " + Character.isDigit(c1));
        System.out.println(c2 + " is letter? " + Character.isLetter(c2));
        System.out.println(c3 + " is uppercase? " + Character.isUpperCase(c3));

        // Converting
        System.out.println(c2 + " to uppercase: " + Character.toUpperCase(c2));
        System.out.println(c3 + " to lowercase: " + Character.toLowerCase(c3));
    }
}