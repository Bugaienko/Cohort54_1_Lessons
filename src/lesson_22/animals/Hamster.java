package lesson_22.animals;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.11.2024
 */

public class Hamster extends Animal{

    @Override
    public void voice() {
        System.out.println("Hamster voice HRUM-hrum");
    }

    @Override
    public String toString() {
        return super.toString() + " | Hamster. Дополнение реализации родительского метода";
    }
}
