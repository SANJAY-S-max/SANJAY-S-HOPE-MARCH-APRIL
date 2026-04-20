import java.util.*;
import java.util.stream.*;

public class StreamMegaExample2 {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + "-" + age;
        }
    }

    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("Ram", 25),
            new Person("John", 17),
            new Person("Alex", 30),
            new Person("Bob", 20),
            new Person("David", 30)
        );

        // ===================== peek (debugging intermediate) =====================
        people.stream()
              .peek(p -> System.out.println("Before filter: " + p))
              .filter(p -> p.age > 18)
              .peek(p -> System.out.println("After filter: " + p))
              .forEach(p -> {}); // terminal


        // ===================== anyMatch =====================
        boolean anyAdult =
            people.stream()
                  .anyMatch(p -> p.age >= 18); // terminal

        System.out.println("Any adult: " + anyAdult);


        // ===================== allMatch =====================
        boolean allAdults =
            people.stream()
                  .allMatch(p -> p.age >= 18); // terminal

        System.out.println("All adults: " + allAdults);


        // ===================== noneMatch =====================
        boolean noneMinor =
            people.stream()
                  .noneMatch(p -> p.age < 18); // terminal

        System.out.println("No minors: " + noneMinor);


        // ===================== findFirst =====================
        Optional<Person> first =
            people.stream()
                  .filter(p -> p.age > 18)
                  .findFirst(); // terminal

        first.ifPresent(System.out::println);


        // ===================== findAny =====================
        Optional<Person> any =
            people.stream()
                  .filter(p -> p.age > 18)
                  .findAny(); // terminal

        any.ifPresent(System.out::println);


        // ===================== min =====================
        Optional<Person> youngest =
            people.stream()
                  .min((a, b) -> a.age - b.age); // terminal

        youngest.ifPresent(System.out::println);


        // ===================== max =====================
        Optional<Person> oldest =
            people.stream()
                  .max((a, b) -> a.age - b.age); // terminal

        oldest.ifPresent(System.out::println);


        // ===================== collect: joining =====================
        String names =
            people.stream()
                  .map(p -> p.name)
                  .collect(Collectors.joining(", ")); // terminal

        System.out.println(names);


        // ===================== collect: groupingBy =====================
        Map<Integer, List<Person>> grouped =
            people.stream()
                  .collect(Collectors.groupingBy(p -> p.age)); // terminal

        System.out.println(grouped);


        // ===================== collect: partitioningBy =====================
        Map<Boolean, List<Person>> partitioned =
            people.stream()
                  .collect(Collectors.partitioningBy(p -> p.age >= 18)); // terminal

        System.out.println(partitioned);


        // ===================== collect: toMap =====================
        Map<String, Integer> map =
            people.stream()
                  .collect(Collectors.toMap(
                      p -> p.name,
                      p -> p.age,
                      (a, b) -> a // handle duplicate keys
                  ));

        System.out.println(map);


        // ===================== mapToInt + sum =====================
        int sum =
            people.stream()
                  .mapToInt(p -> p.age) // primitive stream
                  .sum();               // terminal

        System.out.println("Sum: " + sum);


        // ===================== average =====================
        OptionalDouble avg =
            people.stream()
                  .mapToInt(p -> p.age)
                  .average(); // terminal

        avg.ifPresent(System.out::println);


        // ===================== boxed =====================
        List<Integer> boxed =
            people.stream()
                  .mapToInt(p -> p.age)
                  .boxed()                 // convert back to Integer
                  .collect(Collectors.toList());

        System.out.println(boxed);


        // ===================== iterate (infinite stream) =====================
        Stream.iterate(1, x -> x + 1)
              .limit(5)                   // intermediate to stop infinite
              .forEach(System.out::println); // terminal


        // ===================== generate =====================
        Stream.generate(Math::random)
              .limit(3)
              .forEach(System.out::println);


        // ===================== concat =====================
        Stream<Integer> s1 = Stream.of(1, 2);
        Stream<Integer> s2 = Stream.of(3, 4);

        Stream.concat(s1, s2)
              .forEach(System.out::println);


        // ===================== takeWhile (Java 9+) =====================
        List<Integer> nums = List.of(1, 2, 3, 4, 1, 2);

        nums.stream()
            .takeWhile(x -> x < 4)  // stops when condition fails
            .forEach(System.out::println);


        // ===================== dropWhile =====================
        nums.stream()
            .dropWhile(x -> x < 4)  // skips until condition fails
            .forEach(System.out::println);

    }
}