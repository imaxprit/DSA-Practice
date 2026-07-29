package DSA_DAY_02;

public class ArrayDeletion {

    public static void main(String args[]) {

        int nums[] = {10, 20, 30, 40, 50};

        int pos = 4;

        for(int i=pos; i<nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = 0;

        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Element deleted from index " + pos);
    }

}
