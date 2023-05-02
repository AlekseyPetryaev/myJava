/* Релизовать алгоритм сартировки слияние */
package homeWork.dZ3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class tast1 {
    public static void main(String[] args) {
        int[] array = generateRandomIntArray(20, 20);

        System.out.println(Arrays.toString(array));
    }
    private static int[] generateRandomIntArray(int arrayLength, int upperBound) {
        int[] array = new int[arrayLength];
        Random random = new Random();
        for(int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(upperBound);
        }
        
        return array;
    }
    
}