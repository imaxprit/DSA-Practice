package DSA_DAY_02;

public class ArrayInsertion {
    public static void main(String args[]) {

        int nums[] = {45, 25, 56, 81, 72};

        int pos = 2;
        int element = 36;

        for(int i=nums.length-1; i>pos; i--) {
            nums[i] = nums[i - 1];
        }

        nums[pos] = element;

        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Element inserted at index "+ pos);
    }
}
