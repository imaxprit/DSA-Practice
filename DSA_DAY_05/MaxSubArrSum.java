package DSA_DAY_05;

public class MaxSubArrSum {

    public static void maxSubArrSum(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            int start = i;
            for(int j=i; j<nums.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    // System.out.print(nums[k]+" ");
                    currSum += nums[k];
                }
                // System.out.println();
                System.out.println("Curr Sum : " + currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sub ArraySum = " + maxSum);
    } 
    
    public static void main(String args[]) {

        int nums[] = {-1, -2, 6, -1, 3};
        maxSubArrSum(nums);
    }
}
