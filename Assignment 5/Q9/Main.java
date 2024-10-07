interface Readable {
    void read();
}

interface Writable {
    void write();
}

class File implements Readable, Writable {
    public void read() {
        System.out.println("Reading the file...");
    }

    public void write() {
        System.out.println("Writing to the file...");
    }
}

public class Main {
    public static void main(String[] args) {
        File file = new File();
        file.read();
        file.write();
    }
}