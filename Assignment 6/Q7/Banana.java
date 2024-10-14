class Fruit {
    public void showType() {
        System.out.println("This is a fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void showType() {
        System.out.println("This is an apple");
    }
}

class Banana extends Fruit {
    @Override
    public void showType() {
        System.out.println("This is a banana");
    }

    public static void main(String[] args) {
        Fruit myFruit = new Apple();
        myFruit.showType();
        if (myFruit instanceof Apple) {
            Apple myApple = (Apple) myFruit;
            myApple.showType();
        }
    }
}