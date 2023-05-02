/* Каталог товаров книжного магазина сохранен в виде двухмерного списка List<ArrayList<String>> так, 
что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книга.
Напишите метод Напиши метод для заполнения данной структуры.
*/
package seminars.sem3;


import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.io.FileNotFoundException;
import java.util.*;


public class task7 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1(){
        

        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook,"фентези","гарри поттер");
        addBook(shopBook,"сказки","репка");
        addBook(shopBook,"фентези","гарри поттер");
        addBook(shopBook,"роман","война и мир");
        addBook(shopBook,"сказки","колобок");
        System.out.println(shopBook);
    }
    static void addBook(List<List<String>> shopBook, String genre, String name){
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)){
                shopBook.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list); 

    }
}

/*
Ответ

*/

