// Задача 0: Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class Task_4_0 {
    public static void main(String[] args) {
        int len = 10000;
        long timeAL = getArrayListAddLast(len);
        long timeLL = getLinkedListAddLast(len);
        System.out.println(timeAL);
        System.out.println(timeLL);
    }

    private static long getArrayListAddLast(int len) {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }

    private static long getLinkedListAddLast(int len) {
        LinkedList<Integer> llist = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            llist.add(i);
        }
        long end = System.currentTimeMillis() - start;
        return end;
    }
}
