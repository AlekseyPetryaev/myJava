/*  Напишите метод, который соствит строку, состоящий из 100 повторений слов TEST и метод котрорый запишет эту
    строку в простой текстовый файл, обработайте исключения.  
 */
package seminars.sem2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class task4 {
    public static void main(String[] args) {

        ex4("Test", 20);
    }

    static void ex4(String s, int n){

        String s1 = repeatString(s, n);
        saveToFile(s1);
    }

    static void saveToFile(String s){
        String path = "test.txt";
        // можно так 1 вариант
        // FileWriter printWriter = null;
        // try {
        //     printWriter = new FileWriter(path, true);
        //     printWriter.write(s);
        //     printWriter.flush();
        // } catch (Exception e){
        //     e.printStackTrace();
        // } finally {
        //     try {
        //         printWriter.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        /*  Или так 2 Вариант*/
        try (FileWriter fileWriter = new FileWriter(path, false)){
            fileWriter.write(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } // тут заканчивается 2 вариант
    }
    static String repeatString(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++){
            stringBuilder.append(s);
            // тут добавляем перенос на новую строчку каждое слова
            //stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}

// Создает фаил и внего вкладывает 
//( TestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTest)

//такой вид записи дает 51 строчка (stringBuilder.append("\n");)
/* 
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test
Test*/

// Если надо все удалить из файла и записать заново заместо  true  пишим  false
/*try (FileWriter fileWriter = new FileWriter(path, true))*/