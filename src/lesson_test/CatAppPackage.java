package lesson_test;

import lesson_17.cats.Cat;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.11.2024
 */

public class CatAppPackage {
    public static void main(String[] args) {

        Cat cat = new Cat("Max", 5, 10);

        System.out.println(cat.toString());

        cat.sayMeow();
        // не доступен, т.к. помечено protected и мы находимся в другом пакете
        // cat.weight;

        // protected метод тоже не доступен
        // cat.testProtected();

        // package-default - тоже не доступен
        // cat.age;

    }
}
