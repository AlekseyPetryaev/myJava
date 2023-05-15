package seminars.sem5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task5 {
    public static void main(String[] args) {
        String line = "Мороз и солнце день чудестный\n" +
                    "еще ты дремлишь друг прелестный\n" +
                    "пора красавица проснись.";
        ex3(line);
    }
    static void ex3(String line){
        /*
        Взять набор строк, например,
        Мороз и солнце день чудесный
        Еще ты дремлешь друг прелестный
        Пора красавица проснись.
        Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
        Строки с одинаковой длиной не должны “потеряться”.
        */
        line = line.replace("\n", " ");
        line = line.replace(".", "");
        String[] words = line.split(" ");        //записываем слова через пробелы
        //Map<Integer, List<String>> map = new TreeMap<>(); // сортируется по возрастанию
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder()); // сортируется от большего к меньшему
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len); // длина слова 
                list.add(word);   // влист добавляем новы элемент 
            } else {                     // если такого ключа нет тогда следуюшие 
                List<String> list = new ArrayList<>(); // создаем новый лист пустой 
                list.add(word);         // в этот лист кладём одно лиш слово (word)
                map.put(len, list);     // в maр кладем длину и одно слово (word)
            }
        }
        System.out.println(map);
    }

}
