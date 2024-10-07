class Employee {

    void getDetails() {

        System.out.println("Employee Details");

    }

}

class Manager extends Employee {

    @Override

    void getDetails() {

        super.getDetails();

        System.out.println("Manager Details");

    }

}

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.getDetails();

    }

}