// Задача 3: Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;

public class Task_3_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "4");
        list.add(1, "2");
        list.add(2, "test");
        System.out.println(list);
        deleteNumbers(list);
        System.out.println(list);
    }

    public static void deleteNumbers(List<String> data) {
        for (int i = 0; i < data.size(); i++) {
            if (parsString(data.get(i))) {
                data.remove(i);
                i--;
            }
        }
    }

    public static boolean parsString(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
