package DSA_DAY_31;

public class SumOfNaturalNum {

    public static int sumOfNums(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNums(n-1);
    }
    
    public static void main(String args[]) {

        int n = 5;
        int result = sumOfNums(n);
        System.out.println("Sum of Natural Numbers = " + result);
    }
}
