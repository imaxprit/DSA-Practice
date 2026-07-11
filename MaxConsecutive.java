package Arrays;

public class MaxConsecutive {
    public static int findMaxConsecutiveOnes(int nums[]) {

        int maxCount = 0;
        int currCount = 0;

        for(int num : nums) {
            if(num == 1) {
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            } else {
                currCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        
        int nums[] = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
