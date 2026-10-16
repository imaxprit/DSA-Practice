package DSA_DAY_37;

public class PowerOfN {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    
    public static void main(String[] args) {
        
        int power = power(4, 3);
        System.out.println("Ans : " + power);
    }
}
