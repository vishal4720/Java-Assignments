interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing football");
    }
}

class Basketball implements Playable {
    public void play() {
        System.out.println("Playing basketball");
    }

    public static void main(String[] args) {
        Playable game = new Football();
        game.play();
        game = new Basketball();
        game.play();

    }
}