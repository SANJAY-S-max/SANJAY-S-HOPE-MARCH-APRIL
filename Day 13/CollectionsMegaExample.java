import java.util.*; // For List, Set, Map, Queue, Deque
import java.util.concurrent.*; // For LinkedBlockingQueue
import java.util.Optional;

public class CollectionsMegaExample {
    public static void main(String[] args) {

        // ------------------ 1️⃣ List ------------------
        System.out.println("=== ArrayList Example ===");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove(1);
        System.out.println("After removal: " + arrayList);

        System.out.println("\n=== LinkedList Example ===");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.addFirst("Elephant");
        System.out.println("LinkedList: " + linkedList);
        linkedList.remove("Cat");
        System.out.println("After removal: " + linkedList);

        // ------------------ 2️⃣ Set ------------------
        System.out.println("\n=== HashSet Example ===");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // duplicate ignored
        System.out.println("HashSet: " + hashSet);

        System.out.println("\n=== LinkedHashSet Example ===");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        System.out.println("\n=== TreeSet Example ===");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        System.out.println("TreeSet (sorted): " + treeSet);

        // ------------------ 3️⃣ Map ------------------
        System.out.println("\n=== HashMap Example ===");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        System.out.println("HashMap: " + hashMap);
        System.out.println("Get B: " + hashMap.get("B"));

        System.out.println("\n=== LinkedHashMap Example ===");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("X", 100);
        linkedHashMap.put("Y", 200);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        System.out.println("\n=== TreeMap Example ===");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        System.out.println("TreeMap: " + treeMap);

        System.out.println("\n=== Hashtable Example ===");
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("one", "1");
        hashtable.put("two", "2");
        System.out.println("Hashtable: " + hashtable);

        // ------------------ 4️⃣ Queue / Deque ------------------
        System.out.println("\n=== PriorityQueue Example ===");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Poll (remove smallest): " + pq.poll());

        System.out.println("\n=== ArrayDeque Example ===");
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("ArrayDeque: " + deque);
        System.out.println("Remove first: " + deque.removeFirst());

        System.out.println("\n=== LinkedBlockingQueue Example ===");
        LinkedBlockingQueue<String> lbq = new LinkedBlockingQueue<>();
        lbq.add("Task1");
        lbq.add("Task2");
        System.out.println("LinkedBlockingQueue: " + lbq);
        System.out.println("Take: " + lbq.poll());

        // ------------------ 5️⃣ Utility Classes ------------------
        System.out.println("\n=== Optional Example ===");
        Optional<Integer> optional = Optional.of(42);
        System.out.println("Optional value: " + optional.get());

        Optional<String> empty = Optional.empty();
        System.out.println("Is empty? " + empty.isEmpty());
    }
}