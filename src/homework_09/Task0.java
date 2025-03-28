package homework_09;

/**
 * @author Sergey Bugaenko
 * {@code @date} 15.10.2024
 */

/*
Task 0
Написать метод, принимающий на вход строку.

Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */

public class Task0 {

    public static void main(String[] args) {
        String hello = "Hello";

        printStringLength(hello);
        printStringLength("Hello World!");
    } // End main

    public static void printStringLength(String string) {
        System.out.println(string.length());
    }

} // End class
