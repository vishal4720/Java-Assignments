import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();

        map.put("A", 85.5);
        map.put("C", 92.3);
        map.put("B", 74.8);

        System.out.println("TreeMap (Sorted by Keys): " + map);
    }
}
