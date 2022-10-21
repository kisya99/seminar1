//Учитывая массив целых чисел nums, переместите все 0 элементы в его конец, сохраняя относительный порядок ненулевых элементов.

package seminar1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,3,12};
        int copyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[copyInd] = nums[i];
                copyInd++;
            }
        }
        while (copyInd < nums.length) {
            nums[copyInd++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
