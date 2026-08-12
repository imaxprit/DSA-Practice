package DSA_DAY_10;

public class ElementSumArr {
    
    public static void main(String args[]) {

        int nums[] = {7, 4, 1, 8, 5, 2, 9, 6};
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        float average = sum / nums.length;

        System.out.println("Sum of Element in Array is "+sum);
        System.out.println("Average of Elements in Array is " + average);
    }
}
