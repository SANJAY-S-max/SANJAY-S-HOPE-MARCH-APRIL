import java.util.*;
public class LinkedListImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> runningRace = new LinkedList<>();
        runningRace.add("A");
        runningRace.add("B");
        runningRace.add("C");
        runningRace.addFirst("Start Race");
        System.out.println(runningRace);
        runningRace.remove("B");
        System.err.println("B is disqualified due to early start.");
        System.out.println(runningRace);
        runningRace.addLast("Race Completed");
        

    }
}
