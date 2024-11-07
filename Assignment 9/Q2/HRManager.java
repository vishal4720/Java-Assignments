package company.hr;

import company.Employee;

public class HRManager {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Name: " + emp.name);
        System.out.println("ID: " + emp.id);
        System.out.println("Department: " + emp.department);
        System.out.println("Salary: " + emp.getSalary());
    }
}