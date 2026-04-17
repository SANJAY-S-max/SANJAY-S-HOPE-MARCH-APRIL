
import java.util.*;

public class SortingLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Bob",  "David", "Alice");
        // Collections.sort(names, (a, b) -> a.compareTo(b));
        // System.out.println(names);
        // names.sort(String::compareTo);
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);
    }    
}
