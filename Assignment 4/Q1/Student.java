class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Vishal", 24);
        Student student2 = new Student("Pratik", 22);
        student1.displayDetails();
        student2.displayDetails();
    }
}
