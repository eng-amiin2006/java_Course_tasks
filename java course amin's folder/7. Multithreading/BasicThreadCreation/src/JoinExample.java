public class JoinExample {
    public static void main(String [] args)
    {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted ");                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted ");
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted ");
        }
        System.out.println("Finish");
        }
}
