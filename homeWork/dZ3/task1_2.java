package homeWork.dZ3;

import java.util.ArrayList;
import java.util.*;

public class task1_2 {
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
        System.out.println("Исходный список :" + list);
        return list;
    }

    static void array(ArrayList<Integer> list1) {
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else {
                i++;
            }
        }
        System.out.print("Cписок без четных :" + list1);

    }
}
