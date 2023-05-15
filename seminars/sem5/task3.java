/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
*/
package seminars.sem5;

import java.util.*;
import java.util.HashMap;
import java.util.Stack;

public class task3{
    public static void main(String[] args) {
        System.out.println(ex2("a+(d*3)"));  // Ответ true
    }

    static boolean ex2(String line){
        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        for (int i = 0; i < c1.length; i++){
            if (c1[i] == '('){
                stack.push(c1[i]);
            }
            if (c1[i] == ')'){
                if (stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
}

