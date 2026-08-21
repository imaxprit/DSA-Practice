package DSA_DAY_13;

public class StringFunctions {

    public static boolean stringCompare(String s1, String s2) {
        if (s1 == s2) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String args[]) {

        String s1 = "Apple";
        String s2 = "Apple";

        // System.out.println(stringCompare(s1, s2));

        String s3 = new String("Apple");

        if(s1.equals(s3) && s2.equals(s3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
