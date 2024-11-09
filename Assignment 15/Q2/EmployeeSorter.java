import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vishal", 70000));
        employees.add(new Employee("Kanchan", 50000));

        Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);
        Collections.sort(employees, salaryComparator);
        System.out.println("Sorted list of employees by salary: " + employees);
    }
}
