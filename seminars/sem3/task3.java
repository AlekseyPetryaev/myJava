/* формула для вывода в консоль всех строк в файле. Создаем текстовый фаил чтото там пишим, прописываем 
до него полный путь  */
package seminars.sem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File( "seminars/sem3/test1.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String res = "";
        while (scanner.hasNext()){
            res += scanner.nextLine() + "\n";
        }
        System.out.println(res);
    }
}