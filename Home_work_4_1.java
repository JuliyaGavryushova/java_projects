// 1 Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Home_work_4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(45);
        list.add(8);
        list.add(1);
        list.add(11);
        list.add(2);
        System.out.println(list);
        System.out.println(invertedList(list));
    }
 
    public static LinkedList<Integer> invertedList(LinkedList<Integer> data){
        int sizeLL = data.size();
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < sizeLL; i++) {
            newList.add(i, data.get(sizeLL - 1 - i));;
        }
        return newList;
    }   
}
