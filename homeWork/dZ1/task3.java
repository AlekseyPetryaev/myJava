/*Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)*/

package homeWork.dZ1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        
        int count = 0;//Cчетчик простых чисел
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1;i < n; i++){
            if(numbers(i)){
                System.out.print(i+"\t");
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println("\nот 1 до " + n + "\nКоличество простых чисел " + count);
    }

    public static boolean numbers(int i){ //определить, является ли число простым
        boolean t = false;

        if(i==2){ //Если число равно 2
                t = true;
            }
        for(int j = 2;j < i;j++){  // Если число не равно 2
            if(j==(i-1)){
                t = true;
                }
            if((i % j)==0){
                break;
                }
            }
        return t;
    }
}
