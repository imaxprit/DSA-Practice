package DSA_DAY_10;

public class MaxMinElementArr {

    // calculating the minimum element in array
    public static int minimum(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // calculating the maximum element in array
    public static int maximum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String args[]) {

        int arr[] = {12, 24, 35, 18, 87, 54, 96};
        System.out.println("Minimum Element is " + minimum(arr));
        System.out.println("Maximum Element is " + maximum(arr));

    }
}
