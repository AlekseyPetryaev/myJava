package seminars.sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0() {
        /*
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
         */
        List<Integer> list1 = new ArrayList<>(); // первая колекция 
        List<Integer> list2 = new LinkedList<>(); // вторая колекция 
        long timeStart = System.currentTimeMillis(); // показывает сколько милисекунда была опперация
        for (int i = 0; i < 1000000; i++) {
            list1.add(i);                         // тут указываем какую калекцию нам надо 
        }
        long timeFinish = System.currentTimeMillis(); // тут останавливаем время 
        System.out.println(timeFinish - timeStart);
    }
}

