package DSA_DAY_10;

import java.util.*;
public class MovesZeroArr {
    
    public static void main(String[] args) {
        
        int nums[] = {0, 1, 0, 3, 12, 0, 5};
        int nonZero = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        while (nonZero < nums.length) {
            nums[nonZero] = 0;
            nonZero++;
        }

        System.out.println("Result : " + Arrays.toString(nums));
    }
}
