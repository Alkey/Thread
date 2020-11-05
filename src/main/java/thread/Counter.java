package thread;

public class Counter {
    private int value;
    private static final int NUMBER = 100;

    public void countUp() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public boolean isFinish() {
        return value != NUMBER;
    }
}
