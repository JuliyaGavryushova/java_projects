// Задача 1: Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class Task_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите строку вида text~num:");
        String str = scanner.nextLine();
        scanner.close();
        LinkedList<String> linkedList = addLinkedList(str);
        System.out.println(linkedList);
    }

    private static LinkedList<String> addLinkedList(String st){
        String[] data = st.split("~");
        int pos = Integer.parseInt(data[1]);
        LinkedList<String> list = new LinkedList<>();
        list.add(pos, data[0]);
        return list;
    }
}
