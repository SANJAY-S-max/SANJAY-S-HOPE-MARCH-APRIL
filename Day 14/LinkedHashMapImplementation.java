import java.util.*;

public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(3,"Three");
        map.put(2,"Two");
        map.put(1,"One");
        System.err.println(map);
    }
}
