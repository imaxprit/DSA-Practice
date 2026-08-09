package DSA_DAY_07;

public class CountingSortAlgo {
    
    public static void countingSort(int nums[]) {
        int n = nums.length;

        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<n; i++) {
            count[nums[i]]++;
        }

        int j=0; 
        for(int i=0; i<count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.print("Counting Sort : ");
        for(int no : nums) {
            System.out.print(no + " ");
        }
    }

    public static void main(String[] args) {

        int nums[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(nums);
    }
}
