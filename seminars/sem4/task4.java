/*1) Написать метод, который принимает массив элементов,помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
         */
package seminars.sem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task4 {
    public static void main(String[] args) {
        ex3();
    }

    public static void ex3() {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}

/*Ответ: [1, 2, 3, 4] */