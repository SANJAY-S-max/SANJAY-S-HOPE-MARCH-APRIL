import java.util.*;

public class StreamPrint {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        list.stream().forEach(System.out::println);
        System.out.println("Even numbers:");

        list.stream().filter(x -> x%2 == 0).forEach(System.out::println);
    }
}