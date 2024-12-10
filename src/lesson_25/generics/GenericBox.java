package lesson_25.generics;

/**
 * @author Sergey Bugaenko
 * {@code @date} 05.12.2024
 */

// T - type, E - element, K - key, V-value
public class GenericBox <T> {

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox: {" +
                "value=" + value +
                '}';
    }
}
