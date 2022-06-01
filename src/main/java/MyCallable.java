import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class MyCallable implements Callable {
    static int count = 0;

    public void incrementCount() {
        for(int i = 1; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " Строка - " +  i);
            count++;
        }
    }


    @Override
    public Integer call() throws Exception {
        incrementCount();
        return count;


    }


}
// Вопрос не по теме потоков:
// В цикле кол-во итераций равно 4, но значение COUNT возвращается 5. Объясните, пожалуйста.

