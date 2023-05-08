package homeWork.dz4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {

        Integer[] array = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, array); 

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        
        }
            int sum = 0;
            for (int item : array) {
                sum += item;

            }
            System.out.print("\nСумма в всех элементов: "+ sum);
        }

        public static int dequeue(LinkedList<Integer> list) { 
            int number = list.get(0);
            list.remove(0);
            return number;
        }
    
}