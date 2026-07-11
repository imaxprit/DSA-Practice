package Arrays2;

import java.util.Scanner;

public class MaxNumArr {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter Test Case : ");
            int T = sc.nextInt();
            
            while(T-- > 0) {
                System.out.println("Enter Integer : ");
                int N = sc.nextInt();
                
                int arr[] = new int[N];
                int max = Integer.MIN_VALUE;
                System.out.println("Enter Array Element : ");
                for(int i=0; i<N; i++) {
                    arr[i] = sc.nextInt();
                    if(arr[i] > max) {
                        max = arr[i];
                    }
                }
                System.out.println("Print Max : " + max);
            }

            sc.close();
        }   
}
