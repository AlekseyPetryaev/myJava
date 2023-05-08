/*Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в 
конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает 
первый элемент из очереди, не удаляя.*/
package homeWork.dz4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(list, getRandomNumber()); 
        }
        System.out.println(list);

        System.out.println(dequeue(list)); 
        System.out.println(list);

        System.out.println(first(list));  
        System.out.println(list); 
    }

    public static void enqueue(LinkedList<Integer> list, int number) {
        list.addLast(number);
    }

    public static int dequeue(LinkedList<Integer> list) { 
        int number = list.get(0);
        list.remove(0);
        return number;
    }

    public static int first(LinkedList<Integer> list) { 
        int num = list.get(0);
        return num;
    }

    public static int getRandomNumber() {
        double a = (Math.random() * 20);
        int number = (int) a;
        return number;
    }
}