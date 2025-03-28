package lesson_24.interfaces;

/**
 * @author Sergey Bugaenko
 * {@code @date} 03.12.2024
 */

// Класс реализует (имплементирует) интерфейс
// Если класс не реализовал ВСЕ абстрактные методы интерфейса -
// он обязан объявить себя абстрактным
public class Book implements Printable{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.printf("Book: %s (%s)\n", title, author);
    }

    public void uniqueMethod() {
        System.out.println("uniqueMethod");
    }

    // Не могу переопределить приватный метод
//    @Override
//    void privateMethod(){
//    }

}
