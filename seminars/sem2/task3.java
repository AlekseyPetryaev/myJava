/* Напишите методы, которые принимает на вход строку (String) и опледеляет является ли строка палиндромом 
 * (возвращает boolean значение )
 * Полиндром - Слово или фраза, которые одинаково читаються слева направо и справа налево
*/

package seminars.sem2;

public class task3 {
    public static void main(String[] args) {

        System.out.println(ex2("aaaabbbcddaa"));
    }

    static boolean ex2(String s){


        s = s.replace(" ","");
        StringBuilder StringBuilder1 = new StringBuilder(s);
        StringBuilder1.reverse();
        return StringBuilder1.toString().equalsIgnoreCase(s);
    }
    static String ex1(String s){...}
    static String ex0(char c1, char c2, int n){...}

}