// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Home_work_3_2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 5, 66, 3, 8, 9, 23, 1, 14, 12, -7 };
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        System.out.println(list);
        System.out.println(deleteEvenNum(list));
    }
    
    public static List<Integer> deleteEvenNum(List<Integer> data){
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 2 == 0){
                data.remove(i);
                i--;
            }
        }
        return data;
    }
}
