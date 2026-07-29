package DSA_DAY_02;

import java.util.Arrays;

public class ArraySorting {
    
    public static void main(String args[]) {

        int nums[] = {78, 85, 14, 65, 96, 53, 70, 32};

        Arrays.sort(nums);

        for(int no : nums) {
            System.out.print(no + " ");
        }
    }
}
