/* Во фразе (Добро пожаловать на курс по java) переставить слова в обратном порядке */
package seminars.sem1;


import java.time.LocalTime;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        System.out.println(ex3("Добро пожаловать на курс по java"));
    }

    static String ex3(String text) {


        String res = "";
        String[] temp = text.split(" ");
        for (int i = temp.length-1; i >= 0;  i--) {
            res += temp[i] + " ";
        }

        return res;
    }
    
}

/* 
Ответ 
java по курс на пожаловать Добро 
*/
