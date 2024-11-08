import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(20);
        queue.add(5);
        queue.add(15);

        System.out.println("PriorityQueue (Natural Ordering): ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
