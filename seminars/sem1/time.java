// package seminars.sem1;

// import java.util.Scanner;

// public class time {
//     public static void main(String[] args) {
//         System.out.println("Привет");
//     }

//     static void text(){
//     }
// }

/*1 Задачка 
    В консоли запросить имя пользователя. В зависимость от текущего времени, вывести приветствие вида 
    Доброе утро, Имя! , если время от 05:00 до 11:59 
    Доброе день, Имя! , если время от 12:00 до 17:59; 
    Доброе вечер, Имя! , если время от 18:00 до 22:59;
    Доброе ночи, Имя! , если время от 23:00 до 04:59
*/

package seminars.sem1;

import java.time.LocalTime;
import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0(){

        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        /* задаем по часам */
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Доброе утро, " + name + "!");
        }else if (hour >= 12 && hour < 18){
            System.out.println("Доброе день, " + name + "!");
        }else if (hour >= 18 && hour < 23){
            System.out.println("Доброе вечер, " + name + "!");
        }else {
            System.out.println("Доброе ночи, " + name + "!");
        }
    }
}

// Ответ
// Как тебя зовут?
// Aleksey
// Доброе день, Aleksey!


            /* Вариант попроще
            if (hour >= 5 && hour < 12){
                System.out.println("Доброе утро, " + name + "!");
            }else if (hour > 18){
                System.out.println("Доброе день, " + name + "!");
            }else if (hour < 23){
                System.out.println("Доброе вечер, " + name + "!");
            }else {
                System.out.println("Доброе ночи, " + name + "!");
            */



            // Вариант с минутами
            // System.out.println.("Как тебя зовут? ");
            // Scanner scanner new Scanner(System.in);
            // String name = scanner.nextLine();
            // /* задаем по часам и минутам */
            // LocalTime time1 = LocalTime.of(11, 55);
            // int hour = time.getHour();
            // if (hour >= 5 && time.isBefore(time1)){
            //     System.out.println("Доброе утро, "+ name + "!");
            // }else if (hour >= 12 && hour < 18){
            //     System.out.println("Доброе день, "+ name + "!");
            // }else if (hour >= 18 && hour < 23){
            //     System.out.println("Доброе вечер, "+ name + "!");
            // }else {
            //     System.out.println("Доброе ночи, "+ name + "!");