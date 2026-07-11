package Arrays2;

public class FindMinCount {
    public static int countNonMinimum(int[] nums) {
        // write your code here 
        
        int N = nums.length;
        int count = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }        
        
        for(int i=0; i<N; i++) {
        //   non minimum count
            if(nums[i] != min) {
                count++;
            }
            
        }
        return count;        
    }

    public static void main(String[] args) {
        
        System.out.println(countNonMinimum(null));
    }

}