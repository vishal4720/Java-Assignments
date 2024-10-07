class Vehicle {

    void start() {

        System.out.println("The vehicle is starting.");

    }

}

class Car extends Vehicle {

    void drive() {

        System.out.println("The car is driving.");

    }

}

class ElectricCar extends Car {

    void charge() {

        System.out.println("The electric car is charging.");

    }

}

public class Main {

    public static void main(String[] args) {

        ElectricCar eCar = new ElectricCar();

        eCar.start();

        eCar.drive();

        eCar.charge();

    }

}