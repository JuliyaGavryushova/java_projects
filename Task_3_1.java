// Задача 1: Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_3_1 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random(0);
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(100);
            list.add(number);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
