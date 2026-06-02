package Arrays;

public class LargestNumber {

    // finding largest in array
    public static int largestNum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // finding smallest in array
    public static int smallestNum(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {

        int arr[] = {12, 15, 24, 65, 32, 40, 10};

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int largestNum = largestNum(arr);
        System.out.println("Largest : " + largestNum);

        int smallestNum = smallestNum(arr);
        System.out.println("Smallest : " + smallestNum);
    }
}
