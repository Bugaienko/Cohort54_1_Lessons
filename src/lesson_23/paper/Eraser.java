package lesson_23.paper;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class Eraser extends Pen{
    @Override
    public void draw(String figureName) {
        System.out.println("Стираю " + figureName);
    }
}
