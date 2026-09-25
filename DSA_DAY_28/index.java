package DSA_DAY_28;

public class index {
    
    public static void PrintNums(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintNums(n-1);
    }

    public static void main(String args[]) {
        int n = 10;
        PrintNums(n);
    }
}
