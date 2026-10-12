package DSA_DAY_35;

public class FirstOccurenceArr {

    public static int firstOccurence(int arr[], int key, int i) {

        if(i == arr.length) {
            return -1;
        }

        if(arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }
    
    public static void main(String[] args) {
        
        int arr[] = {8, 5, 4, 2, 6, 4, 7, 1};
        
        System.out.println(firstOccurence(arr, 4, 0));
    }
}
