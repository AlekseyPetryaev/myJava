/* Создать список типа ArrayList Поместить в него как строки, так и целые числа.
Пройтись по списку, найти и удальть целые числа.
*/
package seminars.sem3;


import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.io.FileNotFoundException;
import java.util.*;


public class task6 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1(){
        
        List list = new ArrayList();
        list.add(4);
        list.add("15");
        list.add("Привет");
        list.add(77);
        list.add(5);
        list.add(4.5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}

/*
Ответ

*/

