package DSA_DAY_07;

public class SelectionSortAlgo {
    
    public static void selctionSort(int nums[]) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            int minPos = i;
            for(int j=i+1; j<n; j++) {
                if(nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }

            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }

        System.out.print("After Selction Sorting : ");
        for(int i=0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
    
        int nums[] = {5, 4, 1, 3, 2};

        System.out.print("Before Selction Sorting : ");
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        selctionSort(nums);
    }
}
