package DSA_DAY_10;

import java.util.Arrays;
public class MergeTwoArr {
    
    public static void main(String[] args) {
        
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        int n = arr1.length;
        int m = arr2.length;

        int mergedArr[] = new int[n+m];
        int index = 0;

        for(int num: arr1) {
            mergedArr[index] = num;
            index++;
        }

        for(int num: arr2) {
            mergedArr[index] = num;
            index++;
        }

        System.out.println("Megerd Array = " + Arrays.toString(mergedArr));
    }
}
