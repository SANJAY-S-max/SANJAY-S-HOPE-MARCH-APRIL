
import java.util.*;

public class InteratorImplementation {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value == 10) {
                iterator.remove();
            } else {
                System.out.println(value);
            }
        }
    }
}
