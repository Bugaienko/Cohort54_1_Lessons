package lesson_48;

import java.util.Scanner;

/**
 * @author Sergey Bugaenko
 * {@code @date} 20.03.2025
 */

public class Menu {

    private final static String COLOR_BLACK = "\u001B[0m";

    public static final String COLOR_RESET = "\u001B[0m";
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_YELLOW = "\u001B[33m";
    public static final String COLOR_BLUE = "\u001B[34m";
    public static final String COLOR_PURPLE = "\u001B[35m";
    public static final String COLOR_CYAN = "\u001B[36m";

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(COLOR_RED + "Красный текст!");
        System.out.println("Еще одна строка" + COLOR_RESET);

        System.out.println(COLOR_CYAN + "Светло- синий"  + COLOR_PURPLE + "Другой цвет");

        System.out.println(COLOR_RESET + "Следующая строка");

        System.out.println(COLOR_YELLOW + "Желтый цвет");


    }
}
