/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое */
package homeWork.dZ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2_1 {
    public static void main(String[] args) {
        List<Integer> list = task1_3.randomArray(13, 10, 1);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        double sum = 0;
        for(int i : list){ // цикл foreach в java - для каждого элемента списка выполняется
            sum += i; // вот это условие
        }
        System.out.println(sum/list.size());
    }
}
