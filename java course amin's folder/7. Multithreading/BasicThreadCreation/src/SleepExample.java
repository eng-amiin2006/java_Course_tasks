public class SleepExample {
    public static void main (String[] args) {
        System.out.println("start");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted ");
            }
        }
    }
}