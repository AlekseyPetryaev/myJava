/* Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название 
каждой планеты и количество его повторений в списке. */
package homeWork.dZ3;

import java.util.*;

public class task3_1 {
    public static void main(String[] args) {
        listOfPlanets();
    }

    static void listOfPlanets() {
        Random random = new Random();
        String[] list = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        List<String> newList = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            newList.add(list[random.nextInt(list.length)]);
        }
        System.out.println(newList);
        for (int i = 0; i < list.length; i++) {
            System.out.println("Планета " + list[i] + " повторяется " +
                                    Collections.frequency(newList, list[i]) + " раз(а)");
        }
    }
}
