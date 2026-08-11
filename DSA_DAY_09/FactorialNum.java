package DSA_DAY_09;

import java.util.Scanner;

public class FactorialNum {

    // WAP to find the factorial of a number
    public static void printFactorial(int num) {

        if(num < 0) {
            System.out.println("Error! Factorial of a negative number doesn't exist");
        } else {
            long fact = 1;
            for(int i=1; i<=num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        printFactorial(num);
        sc.close();
    }
}
