class Box<T> {
    private T content;

    public void add(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}

public class GenericBoxDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.add(123);
        System.out.println("Integer box content: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.add("Hello");
        System.out.println("String box content: " + strBox.get());
    }
}
