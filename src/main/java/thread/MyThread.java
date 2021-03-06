package thread;

import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger logger = Logger.getLogger(MyThread.class);
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isFinish()) {
            counter.countUp();
            logger.info(Thread.currentThread().getName() + " value = " + counter.getValue());
        }
    }
}
