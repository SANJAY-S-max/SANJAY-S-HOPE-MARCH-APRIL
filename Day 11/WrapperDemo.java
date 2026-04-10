public class WrapperDemo {
    public static void main(String[] args) {

        // Autoboxing: primitive → object
        int num = 100;
        Integer numObj = num; //(autoboxing)
        System.out.println("Integer object: " + numObj);

        // Unboxing: object → primitive
        Integer obj = new Integer(200);
        int primitiveNum = obj; //(unboxing)
        System.out.println("Primitive int: " + primitiveNum);

        // Using wrapper methods
        String str = "1234";
        int parsed = Integer.parseInt(str); //(convert String to int)
        System.out.println("Parsed int: " + parsed);
    }
}