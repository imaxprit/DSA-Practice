// DSA SOLVING DAY 01

package DSA_SOLVING;
import java.util.*;

public class DuplicatesZero {
    public void duplicateZero(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                for(int j=n-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
                if(i+1 < n) {
                    arr[i+1] = 0;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        DuplicatesZero obj = new DuplicatesZero();

        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        obj.duplicateZero(arr);

        System.out.println(Arrays.toString(arr));
    }
}
