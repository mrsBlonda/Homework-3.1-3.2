public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        Thread thread1 = new Thread(mainGroup, myRunnable);
        Thread thread2 = new Thread(mainGroup, myRunnable);
        Thread thread3 = new Thread(mainGroup, myRunnable);
        Thread thread4 = new Thread(mainGroup, myRunnable);
        thread1.setName("Первый поток");
        thread2.setName("Второй поток");
        thread3.setName("Третий поток");
        thread4.setName("Четвёртый поток");

        System.out.println("Начало процесса");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainGroup.interrupt();
        System.out.println("Конец процесса");


    }
}
