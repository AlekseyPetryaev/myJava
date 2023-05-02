/* формула для вывода в консоль первой строки в файле. Создаем текстовый фаил чтото там пишим, прописываем 
до него полный путь  */
package seminars.sem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class task2 {
public static void main(String[] args) throws FileNotFoundException {
    File file = new File( "seminars/sem3/test1.txt");
    Scanner scanner = new Scanner(file);
    String s = scanner.nextLine();
    System.out.println(s);
    }
}