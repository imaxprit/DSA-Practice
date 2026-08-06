package DSA_DAY_05;

public class KadanesAlgo {

    public static void printMaxSum(int nums[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<nums.length; i++) {
            cs = cs + nums[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sub ArraySum : " + ms);
    }
    
    public static void main(String args[]) {
        int nums[] = {1, -3, 4, 6, 8, -2};
        printMaxSum(nums);
    }
}
