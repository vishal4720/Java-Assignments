import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        linkedList.remove(1);
        arrayList.remove(1);

        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList: " + arrayList);

    }
}
