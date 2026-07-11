package Arrays2;

import java.util.Scanner;

public class SumOfTwoDistinctNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();

            int arr[] = new int[N];

            int largest = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();

                if(arr[i] > largest) {
                    second = largest;
                    largest = arr[i];
                } else if ((arr[i] > second) && (arr[i] != largest)) {
                    second = arr[i];
                }
            }

            System.out.println(largest + second);
            T--;
        }

    
        sc.close();
    }
}
