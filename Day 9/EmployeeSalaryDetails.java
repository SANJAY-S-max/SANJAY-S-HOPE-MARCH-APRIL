// Abstract class Employee
abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implement abstract method
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement abstract method
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class EmployeeSalaryDetails {
    public static void main(String[] args) {
        // Creating employee instances
        Employee emp1 = new FullTimeEmployee("Prasanth K S", 8395, 10500);
        Employee emp2 = new FullTimeEmployee("Sanjay S", 7834, 285854);
        Employee emp3 = new PartTimeEmployee("Anjali R", 9123, 500, 120); // Part-time employee

        // Display salaries
        System.out.println("Employee: " + emp1.name + ", ID: " + emp1.id + ", Salary: " + emp1.calculateSalary());
        System.out.println("Employee: " + emp2.name + ", ID: " + emp2.id + ", Salary: " + emp2.calculateSalary());
        System.out.println("Employee: " + emp3.name + ", ID: " + emp3.id + ", Salary: " + emp3.calculateSalary());
    }
}