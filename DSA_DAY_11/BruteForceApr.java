package DSA_DAY_11;

class BruteForceApr {

    // WAP to find all pairs of elements whose sum equals a given number

    public static void pairWithSum(int nums[], int target) {
        
        boolean found = false;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("No pairs found with the given sum.");
        }

    }

    public static void main(String args[]) {

        int nums[] = {2, 7, 4, 5, 1};
        int target = 6;
        pairWithSum(nums, target);
    }
}