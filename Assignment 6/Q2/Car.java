class Vehicle {

    public void start() {

        System.out.println("Vehicle is starting");

    }

}

class Car extends Vehicle {

    @Override

    public void start() {

        System.out.println("Car is starting");

    }

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.start();

    }

}