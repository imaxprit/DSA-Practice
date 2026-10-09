package DSA_DAY_33;

public class PrintFactorial {

    public static int printFactorial(int n) {
        if (n == 0) 
            return 1;
        int fnm1 = printFactorial(n-1);
        int fn = n * fnm1;
        return fn;
    }
    
    public static void main (String args[]) {

        int num = 6;
        int factorial = printFactorial(num);
        System.out.println("Factorial is " + factorial);
    }
}
