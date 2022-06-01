import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    int count;


    @Override
    public Integer call() throws Exception {

        System.out.println("Работает - " + Thread.currentThread().getName());
        for (count = 1; count <= 3; count++) {
            System.out.println("Привет! Я строка номер " + count + " потока " + Thread.currentThread().getName());
        }
        return count;
    }


}
// Вопрос не по теме потоков:
// В цикле кол-во итераций равно 4, но значение COUNT возвращается 5. Объясните, пожалуйста.

