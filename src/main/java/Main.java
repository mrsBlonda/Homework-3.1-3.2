import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();

        final ExecutorService threadPool = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(myCallable);
        }
        List<Future<Integer>> taskOfResult = threadPool.invokeAll(list);
        for (Future<Integer> number : taskOfResult) {

            int count = number.get();
            System.out.println(count);
        }

        int taskOfResultAny = threadPool.invokeAny(list);
        System.out.println("Возврат успешной операции - " + taskOfResultAny);

        threadPool.shutdown();









    }
}
