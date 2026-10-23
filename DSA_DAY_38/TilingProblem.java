package DSA_DAY_38;

public class TilingProblem {

    public static int numberOfWays(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int fnm1 = numberOfWays(n-1);

        // horizontal choice
        int fnm2 = numberOfWays(n-2);

        // total ways
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    
    public static void main(String args[]) {

        int n = 4;
        System.out.println(numberOfWays(n));
    }
}
