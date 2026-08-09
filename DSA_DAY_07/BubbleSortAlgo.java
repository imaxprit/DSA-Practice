package DSA_DAY_07;

public class BubbleSortAlgo {

    public static void BubbleSort(int nums[]) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp; 
                }
            }
        }

        System.out.print("After Sorting : ");
        for(int i=0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {

        int nums[] = {25, 30, 44, 85, 16};

        System.out.print("Before Sorting : ");
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        BubbleSort(nums);

    }
}
