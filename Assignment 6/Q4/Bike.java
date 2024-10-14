interface Drivable {
    void drive();
}

class Car implements Drivable {
    public void drive() {
        System.out.println("Car is being driven");
    }

}

class Bike implements Drivable {
    public void drive() {
        System.out.println("Bike is being driven");
    }

    public static void main(String[] args) {
        Drivable myCar = new Car();
        Drivable myBike = new Bike();
        myCar.drive();
        myBike.drive();
    }
}