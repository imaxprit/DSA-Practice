package DSA_DAY_33;

public class PrintFibonacciSeries {

    public static int printfibSeries(int n) {
        if (n == 0 || n == 1)
            return n;
        int fibnm1 = printfibSeries(n-1);
        int fibnm2 = printfibSeries(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    
    public static void main (String args[]) {

        int term = 8;
        // int fibSr = printfibSeries(term);
        System.out.println("Fibonacci Series of given term is " + printfibSeries(term));

        System.out.print("Fibonacci series of 5 number is: ");

        for (int i=0; i<term; i++) {
            System.out.print(printfibSeries(i) + " ");
        }
    }
}
