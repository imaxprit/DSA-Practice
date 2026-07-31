package DSA_DAY_04;

public class PairsArr {
    public static void printPairs(int nums[]) {
        for(int i=0; i<=nums.length-1; i++) {
            int curr = nums[i];
            for(int j=i; j<nums.length; j++) {
                System.out.print("(" + curr + ", " + nums[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int nums[] = {2, 4, 6, 8, 10};
        printPairs(nums);
    }
}
