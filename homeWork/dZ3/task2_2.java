/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из 
этого списка. Collections.max() */
package homeWork.dZ3;

    import java.util.*;

public class task2_2 {
    public static void main(String[] args) {
    array(random());
    }

    public static ArrayList<Integer> random() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(0, 20);
            list.add(val);
    }
    System.out.println("Целочисленный список ArrayList :" + list);
    return list;
    }

    static void array(ArrayList<Integer> list1) {
        Collections.min(list1);
        Collections.max(list1);
        float sum = 0;
        for (int i = 0; i < list1.size(); i++) {
        sum += Integer.valueOf(list1.get(i));
        }
        float average = sum / list1.size();
        System.out.println("Минимальное :" + Collections.min(list1) + "\nМаксимальное :" + Collections.max(list1));
        System.out.println("Среднее арифметическое: " + average);
    }
}

