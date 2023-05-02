/* Заполнить список десятью случайными числами. Отсортировать список 
методом sort() и вывести его на экран, и отсартировать по убыванию.
*/
package seminars.sem3;


import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class taskMIN5 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1(){
        
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }
    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }
    static void sort(List<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder()); // сортируем список по убыванию 
    }
}

/*
Ответ
[5, 9, 6, 9, 5, 8, 6, 7, 10, 8]
[10, 9, 9, 8, 8, 7, 6, 6, 5, 5]
*/

