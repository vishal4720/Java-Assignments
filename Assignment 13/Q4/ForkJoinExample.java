import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample extends RecursiveTask<Integer> {
    private final int[] array;
    private final int start, end;

    public ForkJoinExample(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 2) {
            return array[start] + array[start + 1];
        } else {
            int mid = (start + end) / 2;
            ForkJoinExample left = new ForkJoinExample(array, start, mid);
            ForkJoinExample right = new ForkJoinExample(array, mid, end);
            left.fork();
            return right.compute() + left.join();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int[] array = { 1, 2, 3, 4, 5, 6 };
        ForkJoinExample task = new ForkJoinExample(array, 0, array.length);
        System.out.println("Sum: " + pool.invoke(task));
    }
}
