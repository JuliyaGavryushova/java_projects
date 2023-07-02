// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Home_work_3_3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 5, 77, 9, 10, 0, -2, 105, 24 };
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        System.out.println(list);
        // int min = Collections.min(list);
        int min = minNumbers(list);
        System.out.println("Минимальное значение: " + min);
        // int max = Collections.max(list);
        int max = maxNumbers(list);
        System.out.println("Максимальное значение: " + max);
        double mid = arithmeticMean(list);
        System.out.println("Среднее арифметическое: " + mid);

    }

    public static int minNumbers(List<Integer> data){
        int minIdx = 0;
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) < data.get(minIdx)) {
                minIdx = i;
            }
        }
        return data.get(minIdx);
    }

    public static int maxNumbers(List<Integer> data){
        int maxIdx = 0;
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) > data.get(maxIdx)) {
                maxIdx = i;
            }
        }
        return data.get(maxIdx);
    }

    public static double arithmeticMean(List<Integer> data) {
        double sum = 0;
        for (int item : data) {
            sum += item;
        }
        double res = sum / data.size();
        return res;
    }
}
