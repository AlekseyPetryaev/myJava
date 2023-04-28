/* Напишите методы, которые принимает на вход строку (String) и опледеляет является ли строка палиндромом 
 * (возвращает boolean значение )
 * Полиндром - Слово или фраза, которые одинаково читаються слева направо и справа налево
*/

package seminars.sem2;

public class task3_1 {
    public static void main(String[] args) {

        System.out.println(ex2_1("А роза упала н лапу Азора"));
    }

    static boolean ex2_1(String s){
        s = s.replace(" ", "");
        s = s.toLowerCase(null);
        char[] arr = s.toCharArray();
        for(int i = 0, j = arr.length-1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]){
                return false;
            }
        }
        return true;

    }
    static String ex1(String s){...}
    static String ex0(char c1, char c2, int n){...}

}