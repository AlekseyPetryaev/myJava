/*Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
package homeWork.dz4;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Queue;

public class task2_1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println("Удаленный элемент >>>\n" + (dequeue(queue)));
        System.out.println(queue);
        System.out.println("Первый элемент >>>\n" + (first(queue)));
        System.out.println(queue);
    }

    private static String first(Queue<Integer> queue) {
        return null;
    }

    private static String dequeue(Queue<Integer> queue) {
        return null;
    }
}
