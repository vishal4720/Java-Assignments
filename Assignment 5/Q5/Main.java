class Person {

    String name;

    Person(String name) {

        this.name = name;

        System.out.println("Person constructor: " + name);

    }

}

class Student extends Person {

    String id;

    Student(String name, String id) {

        super(name);

        this.id = id;

        System.out.println("Student constructor: " + id);

    }

}

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Vishal", "001");

    }

}