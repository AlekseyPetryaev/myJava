package homeWork.dz5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1{

    public static void addNum(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> PhoneBook = new HashMap<>();
        addNum("Серафим", 953624287, PhoneBook);
        addNum("Игнат", 867744357, PhoneBook);
        addNum("Серафим", 675849392, PhoneBook);
        addNum("Евлампий", 453627180, PhoneBook);
        addNum("Серафим", 786950432, PhoneBook);
        addNum("Игнат", 925762356, PhoneBook);
        addNum("Тими", 201938475, PhoneBook);
        addNum("Фрося", 435261789, PhoneBook);
        printBook(PhoneBook);
    }
}
