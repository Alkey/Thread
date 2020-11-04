import thread.Counter;
import thread.MyRunnable;
import thread.MyThread;

public class MainApp {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new MyThread(counter);
        thread.start();
        Runnable runnable = new MyRunnable(counter);
        new Thread(runnable).start();
    }
}
