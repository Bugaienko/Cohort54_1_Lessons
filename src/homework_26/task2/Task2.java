package homework_26.task2;

import lists.MyArrayList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.12.2024
 */

public class Task2 {

    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);

        System.out.println("\n==============\n");

        MyArrayList<String> languages = new MyArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        printTwoLists(names, languages);
    }

    private static <T,U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {
        // Вывожу элементы первого списка
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // Вывожу элементы второго списка
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
