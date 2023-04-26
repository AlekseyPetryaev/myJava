/* Релизовать фцнкцию возведение числа a в степень b. а, b из Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, Ответ: 9
Пример 2: a = 2, b = - 2, Ответ: 0,25
Пример 3: a = 3, b = 0, Ответ: 1
  */

package seminars.sem1;

import java.time.LocalTime;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println(ex4(2,2));
    }

    static double ex4(int a, int b){


        if (b == 0 || a == 1){
            return 1;
        }
        if (a == 0){
            return 0;
        }
        double res = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            //res = res * a; 
            res *= a;
        }
        return b>0 ? res : 1/res;
    }

    static String ex3(String text) {...}
    

    
    
}

//Ответ 
//8.0