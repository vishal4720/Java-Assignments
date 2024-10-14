class Media {
    public void play() {
        System.out.println("Playing media");
    }
}

class Video extends Media {
    @Override
    public void play() {
        System.out.println("Playing video");
    }
}

class Audio extends Media {
    @Override
    public void play() {
        System.out.println("Playing audio");
    }

    public static void main(String[] args) {
        Media myMedia = new Video();
        myMedia.play();
        myMedia = new Audio();
        myMedia.play();
    }
}