package DSA_DAY_10;

import java.util.Arrays;
public class MergeTwoArr {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    
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
