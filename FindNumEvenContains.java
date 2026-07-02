package Arrays;

public class FindNumEvenContains {
    
    public static int findNumbers(int nums[]) {
        int count = 0;
        
        for(int num : nums) {
            int digit = String.valueOf(num).length();
            if(digit % 2 == 0) {
                count++;    
            }
        }
        return count;
    }

    public static void main(String args[]) {

        int nums[] = {145, 24, 568, 2332};
        System.out.println(findNumbers(nums));
    }
}
