class Circle {
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.displayArea();

        Circle circle2 = new Circle(3.0);
        circle2.displayArea();
    }
}
