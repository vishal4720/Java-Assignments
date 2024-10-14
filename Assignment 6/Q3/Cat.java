class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();
        myAnimal = new Cat();
        myAnimal.makeSound();
    }

}