import java.util.*;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        System.out.println(map);
        String key = "one";
        map.put(key, 2);
        System.out.println(key.hashCode());
        System.out.println(map);
        map.put("three", 3);
        System.out.println(map);
        System.out.println(map.containsKey("one"));
        map.get("hello");
    }
}
