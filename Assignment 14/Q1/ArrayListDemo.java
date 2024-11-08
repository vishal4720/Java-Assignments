import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Element at index 1: " + list.get(1));

        list.remove("Banana");

        System.out.println("Size of list: " + list.size());

        System.out.println("ArrayList: " + list);
    }
}
