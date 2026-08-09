package DSA_DAY_07;

public class InsertionSortAlgo {
    
    public static void insertionSort(int nums[]) {
        int n = nums.length;

        for(int i=1; i<n; i++) {
            int curr = nums[i];
            int prev = i-1;
            while (prev>=0 && nums[prev]>curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr; 
        }

        System.out.print("Sorted Array : ");
        for (int no : nums) {
            System.out.print(no + " ");
        }
    }

    public static void main(String args[]) {

        int nums[] = {15, 22, 10, 28, 14};

        insertionSort(nums);
    }
}
