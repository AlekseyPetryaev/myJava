package seminars.sem3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0(){
        //Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2); //(true)/*этим способом мы сравниваем ссылки и если они совподают выводится*/
        System.out.println(s1 == s3); //(true)/*этим способом мы сравниваем ссылки и если они совподают выводится*/
        System.out.println(s1 == s4); //(true)/*этим способом мы сравниваем ссылки и если они совподают выводится*/
        System.out.println(s1 == s5); //(false)/*этим способом мы сравниваем ссылки и если они совподают выводится*/
        System.out.println(s1 == s6); //(false)/*этим способом мы сравниваем ссылки и если они совподают выводится*/
        System.out.println(s1.equals(s2)); //(true)
    }

}
