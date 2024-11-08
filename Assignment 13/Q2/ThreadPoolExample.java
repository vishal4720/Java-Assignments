import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                () -> "Task 1",
                () -> "Task 2",
                () -> "Task 3");

        executor.invokeAll(tasks);
        String result = executor.invokeAny(tasks);

        System.out.println("First completed task result: " + result);
        executor.shutdown();
    }
}
