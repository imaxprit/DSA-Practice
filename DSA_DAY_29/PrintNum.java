package DSA_DAY_29;

public class PrintNum {
    
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static void main (String args[]) {
        int n = 5;
        printInc(n);

        int n1 = 7;
        printInc(n1);
    }
}
