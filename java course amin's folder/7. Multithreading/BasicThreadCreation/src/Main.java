
public class Main {
    public static void main(String[] args) {
    // extend
            NewThread newThread= new NewThread();
            newThread.start();
   // implements
            Thread run = new Thread(new NewRunnable(),"implements thread");
            run.start();
    }
}