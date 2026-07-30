package DSA_DAY_03;

public class SmallestNumArr {
    
    public static int getSmallest(int nums[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {

        int nums[] = {2, 3, 15, 28, 10, 6};

        System.out.println("Smallest is : " + getSmallest(nums));
    }
}
