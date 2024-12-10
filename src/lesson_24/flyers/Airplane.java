package lesson_24.flyers;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.12.2024
 */

public class Airplane extends Transport implements Flyable {

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Airplane takePassenger");
        capacity++;
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }
}
