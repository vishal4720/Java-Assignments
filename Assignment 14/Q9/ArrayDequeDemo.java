import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.push(10);
        deque.push(20);
        deque.push(30);

        System.out.println("Stack (LIFO): ");
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }

        deque.offer(10);
        deque.offer(20);
        deque.offer(30);

        System.out.println("Queue (FIFO): ");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll());
        }
    }
}
