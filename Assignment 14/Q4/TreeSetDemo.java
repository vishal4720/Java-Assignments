import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);

        System.out.println("TreeSet (Sorted): " + set);
    }
}
