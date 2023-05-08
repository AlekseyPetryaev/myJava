package homeWork.dz4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(getRanNum());
        }
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            System.out.print(list.getLast() + ", ");
            list.removeLast();

        }
    }

    public static int getRanNum() { 
        double random = (Math.random() * 10);
        int num = (int) random;
        return num;
    }
}
