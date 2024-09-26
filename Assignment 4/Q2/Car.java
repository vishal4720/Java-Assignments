class Car {
    String make;
    int year;

    Car() {
        make = "Tata";
        year = 2024;
    }

    void displayDetails() {
        System.out.println("Make: " + make + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.displayDetails();
    }
}
