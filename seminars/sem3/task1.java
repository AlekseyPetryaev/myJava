/* */
package seminars.sem3;

import java.util.ArrayList;
import java.util.List;

public class task6 {
    public static void main(String[] args)
        List<Integer> list = new ArrayList<>();
        int a = 5;
        test(list, a);
        System.out.println(list);
        System.out.println(a);
    }

    static void test(List<Integer> list, int a) {
        list.add(7);
        a++;
    }
}
