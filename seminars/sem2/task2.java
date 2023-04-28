/* Написать метод, который сжимает строку.
Пример : вход aaaabbbcddaa.
Зузультат: a4b3cda2
*/
package seminars.sem2;

public class task2 {
    public static void main(String[] args) {

        System.out.println(ex1("aaaabbbcddaa"));

    }

    static String ex1(String s){

        StringBuilder stringBuilder = new StringBuilder();
        char[] arr =s.toCharArray();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                count++;
            } else {
                stringBuilder.append(arr[i-1]);
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(arr[arr.length-1]);
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
    static String ex0(char c1, char c2, int n){...}
}

// Ответ
// a4b3cd2a2
