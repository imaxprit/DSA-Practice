package DSA_DAY_03;

public class LargestNumArr {
    
    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(largest < nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {

        int nums[] = {19, 16, 30, 25, 10};
        
        System.out.println("Largest is : " + getLargest(nums));
    }
}
