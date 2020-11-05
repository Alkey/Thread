package thread;

public class Counter {
    private static final int NUMBER = 100;
    private int value;

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
