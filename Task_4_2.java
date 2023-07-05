// Задача 2: 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди. 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task_4_2 {
    public static void main(String[] args) {
        int[] array = new int[] { 5, 66, 3, 8, 9, 23 };
        printStack(array);
        System.out.println();
        printQueue(array);
    }

    public static void printStack(int[] arr){
        Stack<Integer> data = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            data.push(arr[i]);
        }
        // for (Integer item : data) {
        //     System.out.print(item + " ");
        // }
        while (!data.isEmpty()) {
            System.out.print(data.pop() + " ");
        }
    }

    public static void printQueue(int[] arr){
        Queue<Integer> data = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            data.add(arr[i]);
        }
        for (Integer item : data) {
            System.out.print(item + " ");
        }
    }
}
