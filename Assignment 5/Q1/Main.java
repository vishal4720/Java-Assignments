class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}