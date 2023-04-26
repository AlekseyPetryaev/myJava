/*Вычислить n! (произведение чисел от 1 до n)*/

package homeWork.dZ1;

import java.util.Scanner;

public class task2 {
public static void main(String[] args) {
    System.out.print("Введите число n: " );
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
        int sum = 1;
        for (int i = 2;i <= n; i++) {
            sum = sum * i;
        }
        System.out.printf("Число (n)= "+ n +"\nПроизведение чисел от 1 до n = "+ sum );
    }
}