package DSA_DAY_36;

public class LastOccurence {

    public static int LastOccurenceArr(int arr[], int key, int i) {

        if(arr.length == i) {
            return -1;
        }

        int isFound = LastOccurenceArr(arr, key, i+1);

        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    } 

    public static void main (String args[]) {

        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(LastOccurenceArr(arr, 5, 0));
    }
    
}