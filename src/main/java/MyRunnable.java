public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(" Работает - " + Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток остановлен");

        }

    }
}