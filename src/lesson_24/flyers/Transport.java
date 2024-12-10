package lesson_24.flyers;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.12.2024
 */

public abstract class Transport {
    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract void takePassenger();
    public int countPassengers() {
        return capacity;
    }
}
