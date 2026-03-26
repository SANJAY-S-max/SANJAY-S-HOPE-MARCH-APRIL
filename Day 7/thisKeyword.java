import java.util.Scanner;
class students{
    int rollNo;
    String name;
    students(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    void display(){
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }
}

public class thisKeyword {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("This is the main method");
        // System.out.print("Enter Student Roll No: ");
        // int rollNo = sc.nextInt();
        // System.out.print("Enter Student Name: ");
        // String name = sc.next();
        // students s1 = new students(rollNo, name);
        // students s2 = new students(rollNo, name);
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
        students s1 = new students(1, "John");
        s1.display();
        System.out.println(s1.hashCode());
        System.err.println();
        students s2 = new students(1, "John");
        s2.display();
        System.out.println(s2.hashCode());
    }
}
