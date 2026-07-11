package Arrays2;

import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicatesZeros(int arr[]) {
        int n = arr.length;

        int dupZero = 0;
        for(int num : arr) {
            if(num == 0) {
                dupZero++;
            }
        }

        for(int i=n-1; i>=0; i--) {
            if(arr[i] == 0) {
                if(i+dupZero < n) {
                    arr[i + dupZero] = 0;
                }
                dupZero--;
                if(i+dupZero < n) {
                    arr[i + dupZero] = 0;
                } else {
                    if (i + dupZero < n) {
                        arr[i + dupZero] = arr[i];
                    }
                }
                
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicatesZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
