/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое */
package homeWork.dZ3;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arraylist.add(random.nextInt(0,20));
        }
        System.out.println(arraylist.toString());
        int max = arraylist.get(0);
        int min = arraylist.get(0);
        int sum = 0;
        for(int i=0;i<arraylist.size();i++){
            if (arraylist.get(i)>max) max = arraylist.get(i);
            if (arraylist.get(i)<min) min = arraylist.get(i);
            sum = sum + arraylist.get(i);
        }
        System.out.println("Максимальное: " + max + "\n");
        System.out.printf("Минимальное: " + min + "\n");
        System.out.printf("Среднее арифметическое: " + ((float)sum/arraylist.size()));
    }
}
