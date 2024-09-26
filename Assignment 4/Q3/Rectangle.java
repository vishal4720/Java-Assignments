class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void displayArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6.0, 3.5);
        rectangle.displayArea();
    }
}
