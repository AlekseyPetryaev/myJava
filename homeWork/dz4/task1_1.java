/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам.*/
package homeWork.dz4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class task1_1 {
    public static List reverseList(List list)
    {
    ArrayList reverse = new ArrayList<>(list);
    Collections.reverse(reverse);
    return reverse;
    }

    public static void main(String[] args)
    {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    List<Integer> reverse = reverseList(list);
    System.out.println(list + " > " + reverse);
    }
}

