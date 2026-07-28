package DSA_DAY_01;

import java.util.Scanner;

public class LinearSearchArr {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Input Search number: ");
        int key = sc.nextInt();

        boolean found = false;
        for(int i=0; i<n; i++) {
            if (arr[i] == key) {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}