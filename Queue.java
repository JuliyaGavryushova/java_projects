// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Queue {

    LinkedList<Integer> data;

    public Queue() {
        data = new LinkedList<>();
    }

    public boolean empty() {
        return data.isEmpty();
    }

    public void enqueue(int num) {
        data.addLast(num);
    }

    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Стек пустой");
        }
        return data.removeFirst();
    }

    public int first(){
         if (empty()) {
            throw new IllegalStateException("Стек пустой");
        }
        return data.getFirst();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.first());

    }
}