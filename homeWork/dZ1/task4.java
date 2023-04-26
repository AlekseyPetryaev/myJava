/*Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)*/

package homeWork.dZ1;

import java.util.Scanner;

public class task4 { 
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    int a = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int b = scanner.nextInt();

    System.out.print("Введите опперацию (+, -, *, /, %): ");
    char action = scanner.next().charAt(0);
    example(a, b, action);
        }
        public static int example(int a, int b, char action)
        {
        int reply = 0;
        if (action == '+') {
            reply = a + b;
        }
        else if (action == '-') {
            reply = a - b;
        }
        else if (action == '*') {
            reply = a * b;
        }
        else if (action == '%') {
            reply = a % b;
        }
        else if (action == '/') {
            reply = a / b;
        }
    System.out.println("Ответ: " + reply);
    return reply;
    }
}