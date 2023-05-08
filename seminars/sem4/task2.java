/*
            Реализовать консольное приложение, которое:
            Принимает от пользователя строку вида
            text~num
            Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
            Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
             */
package seminars.sem4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
    
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();         // команда для считывания 
            String[] arr = line.split("~");    // 
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];

            switch (text) {
                case "print": // если у нас принт 
                    System.out.println(list.remove(num)); // тогдп будет это 
                    break;
                case "exit":   // если у нас принт exit
                    System.out.println("До скорой встречи!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
            System.out.println();
        }
    }
}