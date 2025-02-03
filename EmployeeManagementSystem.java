/*Abstraction:
Question:
Design an Employee Management System where you create an abstract class Employee
with abstract methods like calculateSalary() and displayDetails(). 
Create two derived classes, FullTimeEmployee and PartTimeEmployee, and implement
the abstract methods. For FullTimeEmployee, calculate salary as a fixed monthly
rate, and for PartTimeEmployee, calculate salary based on hourly rates. 
Demonstrate polymorphism by creating an array of Employee objects and 
calculating/displaying salaries using overridden methods.*/

// Abstract class Employee
abstract class Employee {
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract methods
    public abstract double calculateSalary();

    public abstract void displayDetails();
}

// Derived class FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implementation of calculateSalary()
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    // Implementation of displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Monthly Salary: ₹" + calculateSalary());
    }
}

// Derived class PartTimeEmployee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary()
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implementation of displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

// Main class to demonstrate polymorphism
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] employees = new Employee[3];

        // Add FullTimeEmployee and PartTimeEmployee objects to the array
        employees[0] = new FullTimeEmployee("Rajesh Kumar", 101, 55000);
        employees[1] = new PartTimeEmployee("Priya Sharma", 102, 600, 75);
        employees[2] = new FullTimeEmployee("Anjali Mehta", 103, 70000);

        // Iterate through the array and display details/salaries
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println(); 
        }
    }
}



