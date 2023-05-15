package Lectures.Lec3;

import java.util.*;

public class task7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.print(item + " ");
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            col.remove(); //1 12 123 1234 12345  или пирамидкой в в столбик 
            System.out.print(col.next()+ " ");
            //col.next(); // 1 123 12345    или пирамидкой в в столбик
        }

    }
}
