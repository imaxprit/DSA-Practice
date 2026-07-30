package DSA_DAY_03;

public class LinearSearchAlgo {
    
    public static int linearSearch(int nums[], int key) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        int nums[] = {14, 25, 63, 45, 16, 34};
        int key = 45;
        int index = linearSearch(nums, key);

        if(index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}
