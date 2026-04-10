import java.util.*;
import java.util.stream.*;

public class MegaCollectionsDemo {

    public static void main(String[] args) {

        // ===================== LIST =====================
        System.out.println("---- LIST (ArrayList) ----");
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // insert at index

        System.out.println("List: " + list);
        System.out.println("Get index 2: " + list.get(2));
        list.set(2, 25);
        System.out.println("After set: " + list);

        list.remove(Integer.valueOf(15));
        System.out.println("After remove: " + list);

        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Size: " + list.size());

        // Iteration
        System.out.print("For-each loop: ");
        for (int num : list) System.out.print(num + " ");
        System.out.println();

        System.out.print("Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        // ===================== LINKED LIST =====================
        System.out.println("\n---- LINKED LIST ----");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.addFirst("Start");
        ll.addLast("End");

        System.out.println("LinkedList: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removal: " + ll);

        // ===================== SET =====================
        System.out.println("\n---- HASHSET ----");
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(5); // duplicate ignored
        System.out.println("HashSet: " + set);
        set.remove(1);
        System.out.println("After remove: " + set);

        // ===================== TREESET =====================
        System.out.println("\n---- TREESET ----");
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(50);
        tset.add(10);
        tset.add(30);
        System.out.println("TreeSet (sorted): " + tset);
        System.out.println("First: " + tset.first());
        System.out.println("Last: " + tset.last());
        System.out.println("Higher than 10: " + tset.higher(10));

        // ===================== MAP =====================
        System.out.println("\n---- HASHMAP ----");
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("HashMap: " + map);
        System.out.println("Get A: " + map.get("A"));

        map.putIfAbsent("D", 4);
        map.replace("A", 10);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        System.out.println("Iteration:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ===================== TREEMAP =====================
        System.out.println("\n---- TREEMAP ----");
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(3, "C");
        tmap.put(1, "A");
        tmap.put(2, "B");

        System.out.println("TreeMap (sorted by keys): " + tmap);
        System.out.println("First Key: " + tmap.firstKey());
        System.out.println("Last Key: " + tmap.lastKey());
        System.out.println("Ceiling Key(2): " + tmap.ceilingKey(2));
        System.out.println("Floor Key(2): " + tmap.floorKey(2));

        // ===================== QUEUE =====================
        System.out.println("\n---- QUEUE (PriorityQueue) ----");
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Peek: " + pq.peek());
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);

        // ===================== DEQUE =====================
        System.out.println("\n---- DEQUE ----");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.offerFirst(0);
        System.out.println("Deque: " + dq);
        dq.pollLast();
        System.out.println("After pollLast: " + dq);

        // ===================== COLLECTIONS UTILITY =====================
        System.out.println("\n---- COLLECTIONS UTILS ----");
        List<Integer> utilList = new ArrayList<>(Arrays.asList(5, 2, 8, 1));
        Collections.sort(utilList);
        System.out.println("Sorted: " + utilList);
        Collections.reverse(utilList);
        System.out.println("Reversed: " + utilList);
        Collections.shuffle(utilList);
        System.out.println("Shuffled: " + utilList);
        Collections.swap(utilList, 0, 1);
        System.out.println("Swap 0 & 1: " + utilList);
        Collections.fill(utilList, 100);
        System.out.println("Fill 100: " + utilList);

        // ===================== ARRAYS UTILITY =====================
        System.out.println("\n---- ARRAYS UTILS ----");
        int[] arr = {5, 2, 8, 1};
        Arrays.sort(arr);
        System.out.println("Arrays.sort: " + Arrays.toString(arr));
        Arrays.fill(arr, 7);
        System.out.println("Arrays.fill: " + Arrays.toString(arr));
        System.out.println("Arrays.binarySearch 7: " + Arrays.binarySearch(arr, 7));

        // ===================== FREQUENCY EXAMPLE =====================
        System.out.println("\n---- FREQUENCY COUNT ----");
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency using HashMap: " + freqMap);

        // Sorted frequency using TreeMap
        Map<Integer, Integer> sortedFreq = new TreeMap<>(freqMap);
        System.out.println("Sorted Frequency using TreeMap: " + sortedFreq);

        // Java 8 Stream frequency
        List<Integer> numList = Arrays.asList(1, 2, 2, 3, 1, 4, 2);
        Map<Integer, Long> streamFreq = numList.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("Frequency using Streams: " + streamFreq);
    }
}