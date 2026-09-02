package DSA_DAY_16;

public class BitManipulation {
    
    // Bitwise operator
    public static void main(String[] args) {
        
        // Binary AND &
        System.out.println(5 & 6);

        // Binary OR |
        System.out.println(5 | 6);

        // Binary XOR ^
        System.out.println(5 ^ 6);

        // Binary One's Complement ~ 
        System.out.println(~5);     // ~n = -(n+1)
        System.out.println(~9);

        // Binary Left shift << 
        System.out.println(5 << 2);
        System.out.println(3 << 4);
        System.out.println(8 << 3);

        // Binary Right shift >>
        System.out.println(6 >> 1);
        System.out.println(12 >> 4);

        printEvenOdd(10);
    }


    // check if a number is even or odd
    public static void printEvenOdd(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
