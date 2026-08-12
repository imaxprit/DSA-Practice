package DSA_DAY_10;

public class CountEvenInArr {
    
    public static void main(String args[]) {

        int nums[] = {3, 6, 9, 8, 5, 2, 1, 4, 7};
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2 == 0) {
                count++;
            }
        }

        System.out.println("Total Even Numbers are " + count);
    }
}
