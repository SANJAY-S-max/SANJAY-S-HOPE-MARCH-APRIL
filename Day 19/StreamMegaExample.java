import java.util.*;
import java.util.stream.*;

public class StreamMegaExample {

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

        // ===================== SOURCE / STARTING ACTION =====================
        // creating initial data (this is NOT a stream yet)
        List<Person> people = List.of(
            new Person("Ram", 25),
            new Person("John", 17),
            new Person("Alex", 30),
            new Person("Bob", 20),
            new Person("Ram", 25) // duplicate
        );

        // convert collection to stream → STARTING ACTION
        Stream<Person> stream = people.stream();

        // ===================== FULL STREAM PIPELINE =====================
        List<String> result =
            people.stream() // SOURCE / START

                // ===================== INTERMEDIATE OPERATIONS =====================
                // filter → keep only age >= 18
                .filter(p -> p.age >= 18)

                // remove duplicates
                .distinct()

                // sort by age
                .sorted((a, b) -> a.age - b.age)

                // map → convert Person to name
                .map(p -> p.name)

                // convert to uppercase using ::
                .map(String::toUpperCase)

                // limit results
                .limit(3)

                // skip first element
                .skip(0)

                // ===================== TERMINAL OPERATION =====================
                // collect result into list → triggers execution
                .collect(Collectors.toList());

        // printing final result
        System.out.println(result);


        // ===================== TERMINAL: forEach =====================
        people.stream()
              .filter(p -> p.age > 18)     // intermediate
              .map(p -> p.name)            // intermediate
              .forEach(System.out::println); // terminal


        // ===================== TERMINAL: count =====================
        long count =
            people.stream()
                  .filter(p -> p.age >= 18) // intermediate
                  .count();                 // terminal

        System.out.println("Count: " + count);


        // ===================== TERMINAL: reduce =====================
        int totalAge =
            people.stream()
                  .map(p -> p.age)          // intermediate
                  .reduce(0, (a, b) -> a + b); // terminal

        System.out.println("Total Age: " + totalAge);


        // ===================== FLATMAP EXAMPLE =====================
        List<List<Integer>> nested = List.of(
            List.of(1, 2),
            List.of(3, 4)
        );

        nested.stream()                     // source
              .flatMap(x -> x.stream())     // intermediate
              .map(x -> x * 10)             // intermediate
              .forEach(System.out::println); // terminal


        // ===================== SORT WITH :: =====================
        List<String> names = List.of("ram", "alex", "john");

        names.stream()
             .sorted(String::compareTo)     // intermediate using ::
             .forEach(System.out::println); // terminal


        // ===================== NO TERMINAL (WILL NOT RUN) =====================
        people.stream()
              .filter(p -> p.age > 18)
              .map(p -> p.name);
        // ❌ nothing happens because no terminal operation

    }
}