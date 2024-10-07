class Shape {

    double area;

}

class Circle extends Shape {

    double radius;

    Circle(double radius) {

        this.radius = radius;

    }

    void calculateArea() {

        area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);

    }

}

class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {

        this.length = length;

        this.breadth = breadth;

    }

    void calculateArea() {

        area = length * breadth;

        System.out.println("Area of the rectangle: " + area);

    }

}

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5.0);

        circle.calculateArea();

        Rectangle rectangle = new Rectangle(4.0, 6.0);

        rectangle.calculateArea();

    }

}