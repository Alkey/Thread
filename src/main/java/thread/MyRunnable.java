package thread;

import org.apache.log4j.Logger;

public class MyRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(MyRunnable.class);
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() != 100) {
            counter.countUp();
            logger.info(Thread.currentThread().getName() + " value = " + counter.getValue());
        }
    }
}
