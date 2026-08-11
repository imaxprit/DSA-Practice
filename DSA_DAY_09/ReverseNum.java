package DSA_DAY_09;

public class ReverseNum {
    
    // WAP to reverse a number
    public static void main(String[] args) {
        
        int num = 12345;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Num: " + rev);
    }
}
