/*  Напишите метод, который соствит строку, состоящий из 100 повторений слов TEST и метод котрорый запишет эту
    строку в простой текстовый файл, обработайте исключения И выводить дополнительно любую нашу фразу  
 */
package seminars.sem2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task5 {
    public static void main(String[] args) {

        ex5("Test", 20);
    }

    static void ex5(String s, int n){

        String s1 = repeatString(s, n);
        saveToFile(s1);
    }

    static void saveToFile(String s){
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            //fileHandler = new FileHandler("log.txt");
            //fileHandler = new FileHandler("log1.txt");
            fileHandler = new FileHandler("log2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // спомощюу этого кода будет будет задпись об ощибке не в XSML файле 
        //SimpleFormatter formatter = new SimpleFormatter();
        //fileHandler.setFormatter(formatter);
        //
        logger.addHandler(fileHandler);
        String path = "g/g/g/test.txt";
        try (FileWriter fileWriter = new FileWriter(path, false)){
            fileWriter.write(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            //logger.log(Level.WARNING, "Что то пошло не так, chto to pashlo ne tak");
            logger.log(Level.WARNING, e.getMessage()); // будет выводить описание ощибки от самой 
                                                            //программы в фаил log2.txt
        }
        System.out.println("Тест");
        fileHandler.close();
    }
    static String repeatString(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

}
