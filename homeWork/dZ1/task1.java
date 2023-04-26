/*Вычислить n-ое треугольного число (сумма чисел от 1 до n)*/

package homeWork.dZ1;

import java.util.Scanner;

public class task1 {
public static void main(String[] args) {
        System.out.print("Введите число n: " );
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0;i <= n; i++) {
            sum = sum + i;
        }
        System.out.printf("Число (n)= "+ n +"\nСумма чисел от 1 до n = "+ sum );
    }
}