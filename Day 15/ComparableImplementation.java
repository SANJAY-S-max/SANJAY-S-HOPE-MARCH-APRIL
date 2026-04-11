import java.util.*;
public class ComparableImplementation {
        static class Student implements Comparable<Student> {
        int rollNo;
        String name;
        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }
        @Override
        public int compareTo(Student s) {
            return this.rollNo - s.rollNo; // Ascending order based on roll number
        }
    }
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(3, "Alice"));
        s.add(new Student(1, "Bob"));
        s.add(new Student(2, "Charlie"));

        Collections.sort(s);

        for (Student student : s) {
            System.out.println(student.name + " (Roll No: " + student.rollNo + ")");
        }
    }    
}
