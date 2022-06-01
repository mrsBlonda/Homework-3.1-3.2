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
        for (int i = 0; i < taskOfResult.size(); i++) {
            int count = taskOfResult.get(i).get();
            System.out.println("Поток " + (i + 1) + " - " + count);
        }


        int taskOfResultAny = threadPool.invokeAny(list);
        System.out.println("Возврат успешной операции - " + taskOfResultAny);

        threadPool.shutdown();









    }
}
