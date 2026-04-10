import java.util.*;
import java.util.stream.*;

public class JavaCollectionsBible {

    // Custom class for comparator examples
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + "(" + age + ")";
        }
    }

    public static void main(String[] args) {

        // ===================== LIST =====================
        System.out.println("---- LIST (ArrayList) ----");
        List<Integer> list = new ArrayList<>();

        list.add(10);             // add at end
        list.add(20);
        list.add(30);
        list.add(1, 15);          // add at index 1
        System.out.println("List: " + list);

        list.get(2);              // get element
        list.set(2, 25);          // set element at index
        list.remove(Integer.valueOf(15)); // remove by value
        list.remove(1);           // remove by index
        list.contains(20);        // check if exists
        list.isEmpty();           // check if empty
        list.size();              // size
        list.clear();             // remove all elements

        // Refill for iteration demo
        list.addAll(Arrays.asList(10, 20, 30));
        // Iteration
        for (Integer n : list) System.out.print(n + " "); // for-each
        System.out.println();
        Iterator<Integer> it = list.iterator();           // iterator
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
        list.listIterator();        // list iterator

        // ===================== LINKED LIST =====================
        System.out.println("\n---- LINKED LIST ----");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A"); ll.addFirst("Start"); ll.addLast("End");
        ll.removeFirst(); ll.removeLast();
        ll.peek();                  // first element
        ll.poll();                  // remove first
        ll.offer("New");            // add at end
        ll.offerFirst("First");
        ll.offerLast("Last");
        ll.contains("A");

        // ===================== SET =====================
        System.out.println("\n---- HASHSET ----");
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(2); set.add(3); set.add(1); // duplicates ignored
        set.remove(2);
        set.contains(3);
        set.isEmpty();
        set.size();
        set.clear();

        System.out.println("\n---- TREESET ----");
        TreeSet<Integer> tset = new TreeSet<>();
        tset.addAll(Arrays.asList(50, 10, 30, 40));
        tset.first();               // smallest
        tset.last();                // largest
        tset.higher(25);            // >25
        tset.lower(25);             // <25
        tset.ceiling(30);           // >=30
        tset.floor(30);             // <=30
        tset.pollFirst();           // remove first
        tset.pollLast();            // remove last
        tset.contains(40);

        System.out.println("\n---- LINKEDHASHSET ----");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.addAll(Arrays.asList(3,1,2,3));
        lhs.remove(1);
        lhs.contains(2);

        // ===================== MAP =====================
        System.out.println("\n---- HASHMAP ----");
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1); map.put("B", 2); map.put("C", 3);
        map.get("A");                // get value
        map.putIfAbsent("D", 4);
        map.replace("A", 10);
        map.containsKey("B");
        map.containsValue(2);
        map.remove("C");
        map.keySet();
        map.values();
        map.entrySet();
        map.clear();
        map.isEmpty();
        map.size();

        System.out.println("\n---- TREEMAP ----");
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(3,"C"); tmap.put(1,"A"); tmap.put(2,"B");
        tmap.firstKey();
        tmap.lastKey();
        tmap.ceilingKey(2);
        tmap.floorKey(2);
        tmap.higherKey(1);
        tmap.lowerKey(3);
        tmap.pollFirstEntry();
        tmap.pollLastEntry();
        tmap.containsKey(2);
        tmap.containsValue("B");

        System.out.println("\n---- LINKEDHASHMAP ----");
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("X",100); lhm.put("Y",200); lhm.put("Z",300);
        lhm.get("Y");
        lhm.keySet();
        lhm.values();
        lhm.entrySet();

        // ===================== QUEUE =====================
        System.out.println("\n---- QUEUE (PriorityQueue) ----");
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30); pq.add(10); pq.add(20);
        pq.peek();
        pq.poll();
        pq.offer(15);
        pq.remove(20);
        pq.contains(10);

        System.out.println("\n---- DEQUE ----");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1); dq.addLast(2);
        dq.offerFirst(0); dq.offerLast(3);
        dq.peekFirst(); dq.peekLast();
        dq.pollFirst(); dq.pollLast();
        dq.contains(2);

        // ===================== STACK & VECTOR (Legacy) =====================
        System.out.println("\n---- STACK ----");
        Stack<Integer> stack = new Stack<>();
        stack.push(1); stack.push(2); stack.push(3);
        stack.pop();
        stack.peek();
        stack.search(2);

        System.out.println("\n---- VECTOR ----");
        Vector<String> vector = new Vector<>();
        vector.add("A"); vector.add("B"); vector.add("C");
        vector.remove("B");
        vector.contains("A");
        vector.firstElement();
        vector.lastElement();
        vector.capacity();
        vector.size();
        vector.isEmpty();

        // COLLECTIONS UTILITY
        System.out.println("\n---- COLLECTIONS UTILS ----");
        List<Integer> utilList = new ArrayList<>(Arrays.asList(5,2,8,1));
        Collections.sort(utilList);
        Collections.reverse(utilList);
        Collections.shuffle(utilList);
        Collections.swap(utilList,0,1);
        Collections.fill(utilList,100);
        Collections.min(utilList);
        Collections.max(utilList);
        Collections.frequency(utilList,100);

        // ===================== ARRAYS UTILITY =====================
        System.out.println("\n---- ARRAYS UTILS ----");
        int[] arr = {5,2,8,1};
        Arrays.sort(arr);
        Arrays.fill(arr,7);
        Arrays.binarySearch(arr,7);
        Arrays.toString(arr);
        Arrays.asList(1,2,3);

        // ===================== FREQUENCY EXAMPLES =====================
        System.out.println("\n---- FREQUENCY COUNT ----");
        int[] nums = {1,2,2,3,1,4,2};
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int n:nums) freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        new TreeMap<>(freqMap);
        Arrays.stream(nums).boxed()
            .collect(Collectors.groupingBy(x->x,Collectors.counting()));

        // ===================== CUSTOM OBJECTS & COMPARATORS =====================
        System.out.println("\n---- CUSTOM OBJECTS & COMPARATORS ----");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice",30));
        people.add(new Person("Bob",25));
        people.add(new Person("Charlie",35));

        // Sort by age
        people.sort(Comparator.comparingInt(p -> p.age));
        // Sort by name desc
        people.sort((p1,p2)->p2.name.compareTo(p1.name));
        // TreeSet with comparator
        TreeSet<Person> personSet = new TreeSet<>(Comparator.comparingInt(p->p.age));
        personSet.addAll(people);

        System.out.println("Demo complete! All collections and utilities covered.");
    }
}