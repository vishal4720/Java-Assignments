class Employee {
    static String companyName = "TechCorp";
    String name;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Company: " + companyName + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
