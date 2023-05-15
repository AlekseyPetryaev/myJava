/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1]*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
*/
package seminars.sem5;

import java.util.*;
import java.util.HashMap;
import java.util.Stack;

public class task4{
    public static void main(String[] args) {
        System.out.println(ex2("a+(d*3)"));  // Ответ true
    }

    static boolean ex2(String line){
    
        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put('<','>');
        //map.put('(',')');
        //map.put('[',']');
        //map.put('{','}');
        //map.put('<','>');

        // for (int i = 0; i < c1.length; i++) {    
        //     if (map.containsValue(c1[i])){      // containsKey
        //         stack.push(c1[i]);
        //     }
        //     if (map.containsKey(c1[i])){        // containsValu
        //         if (stack.isEmpty() || map.get(c1[i]) != stack.pop()){
        //             return false;
        //         }
        //     }
        // }
        // return stack.isEmpty();

        // или так записать можно 
        for (char c : c1) {    
            if (map.containsValue(c)){      // containsKey
                stack.push(c);
            }
            if (map.containsKey(c)){        // containsValu
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();




    }
}