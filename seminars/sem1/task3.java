/*Дан массив nums =[3,2,5,3] и число val = 3. 
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    Таким образом, первые несколько (или все) элементов массива должны быть отличны от 
    заданного, а остальное - равны ему
*/
package seminars.sem1;

import java.util.Arrays;

public class task3 {
    
    public static void main (String[] args) {
        int[] nums = new int []{3,2,5,3};
        int[] our_result = getResultArray(nums, 3);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(our_result));
    }
    
    static int[] getResultArray(int[] temp, int condition) {
        int size = temp.length;
        int[] result = new int[size];

        Arrays.fill(result, condition);

        for (int i = 0, j = 0; i < size; i++) {
            if (temp[i] != condition) {
                result[j] = temp[i];
                j++;
            }
        }
        return result;
    }
}

// Ответ 
// [3, 2, 5, 3]
// [2, 5, 3, 3]