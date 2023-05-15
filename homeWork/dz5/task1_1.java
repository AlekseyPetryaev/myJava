/*Чтобы реализовать структуру телефонной книги с помощью HashMap, мы будем использовать класс HashMap 
из библиотеки java.util.
Создадим класс PhoneBook и определим в нем HashMap&lt;String, List&gt;.
Здесь ключом в HashMap будет являться фамилия контакта, а значением - список телефонов контакта.
Теперь добавим две функции в класс PhoneBook - addPhoneNumber() и printAllNumbers().
Функция addPhoneNumber() принимает два аргумента - фамилию и номер телефона.
Она проверяет, существует ли фамилия уже в HashMap, если да - добавляет новый номер в список этого 
контакта, если нет - создает новую запись в HashMap с новым списком телефонов.
Функция printAllNumbers() просто перебирает все записи в HashMap и выводит на экран все фамилии и 
список телефонов, соответствующих каждой фамилии.
Ниже приводится полный код класса PhoneBook: */
package homeWork.dz5;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class task1_1 {
    private HashMap<String, List> contacts;

    public void PhoneBook() {
        contacts = new HashMap<String, List>();
    }

    public void addPhoneNumber(String name, String number) {
        List numbers;
        if (contacts.containsKey(name)) {
            numbers = contacts.get(name);
        } else {
            numbers = new ArrayList();
            contacts.put(name, numbers);
        }
        numbers.add(number);
    }

    public void printAllNumbers() {
        for (String name : contacts.keySet()) {
            System.out.print(name + ": ");
            List numbers = contacts.get(name);
            for (String number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите 1, чтобы добавить номер контакт \nВведите 2 чтобы напечатать все контакты");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Введите имя:");
                String name = scanner.next();
                System.out.println("Введите номер:");
                String number = scanner.next();
                phoneBook.addPhoneNumber(name, number);
            } else if (choice == 2) {
                phoneBook.printAllNumbers();
            }
        }
    }
}

/*
 * В функции main мы создаем объект класса PhoneBook и в бесконечном цикле
 * запрашиваем у пользователя выбор
 * между добавлением нового номера и выводом всех номеров.
 * В функции addPhoneNumber() мы сначала проверяем, существует ли фамилия уже в
 * HashMap, используя containsKey().
 * Если существует, мы получаем список телефонов этого контакта из HashMap,
 * используя метод get(). Если не
 * существует, мы создаем новый список и добавляем его в HashMap для данной
 * фамилии.
 * Мы затем добавляем новый телефон в список методом add().
 * В функции printAllNumbers() мы перебираем все записи в HashMap с помощью
 * keySet() и получаем список
 * телефонов для каждой фамилии методом get(). Затем мы просто выводим все
 * фамилии и соответствующие
 * им списки телефонов на экран.
 */
