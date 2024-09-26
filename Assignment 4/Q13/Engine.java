class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void showCarDetails() {
        System.out.println("Car has an engine of type: " + engine.getType());
    }

    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car(engine);
        car.showCarDetails();
    }
}
