class Student {
    String name;
    char grade;

    Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Vishal", 'A'),
                new Student("Mayur", 'B'),
                new Student("Pratik", 'F')
        };

        for (Student student : students) {
            student.displayDetails();
        }
    }
}
