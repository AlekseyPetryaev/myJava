package homeWork.dZ2;

import java.io.*;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {


        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\": \"Физика\"}]";

        System.out.println("Искомый текст :" + text);
        changeString("Обработанный текст :" + text);
        //readFile();
        
        String s = readFile();
        changeString(s);
    }

    public static void changeString(String args) {
        StringBuilder stringBuilder = new StringBuilder();

        args = args.replace(":", ",")
                .replaceAll("[^A-Za-zА-Яа-я-0-9-,]", "")
                .replace("фамилия", "Студент")
                .replace("оценка", "получил")
                .replace("предмет", "по предмету");

        String[] myString = args.split(",");
        for (int i = 0; i < myString.length; i++) {
            if (myString[i].equals("Студент") && i != 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(myString[i] + " ");
        }
        
        System.out.println(stringBuilder.toString());
        saveToFile(stringBuilder.toString());
    }

    public static void saveToFile(String str) { //
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("homeWork/dZ2/file.txt", true), "UTF-8"))) {
            writer.write(str);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

    static String readFile(){
        File file = new File("homeWork/dZ2/file.json");
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
        return res;
    }
}