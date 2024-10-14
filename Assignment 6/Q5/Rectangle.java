abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw();
        myShape = new Rectangle();
        myShape.draw();
    }
}