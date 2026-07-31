package DSA_DAY_04;

public class ReverseArr {
    public static void reverseArr(int nums[]) {
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }
    
    public static void main(String args[]) {

        int nums[] = {8, 5, 7, 9, 3, 6};
        reverseArr(nums);

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}
