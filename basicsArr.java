package Arrays;

import java.util.Scanner;

public class basicsArr {
    public static void main(String args[]) {
        
        // Creation of array
        // int marks[] = new int[50];
        // int nums[] = {10, 30, 45};
        // String fruits[] = {"Mango", "Apple", "Banana"};

        // input-output
        int marks[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<marks.length; i++) {
            System.out.print("Enetr element index "+ i);
            marks[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Output of Marks : ");

        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("Length of Marks is "+ marks.length);


        
    }
}
