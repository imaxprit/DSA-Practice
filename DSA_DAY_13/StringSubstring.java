package DSA_DAY_13;

public class StringSubstring {

    public static String mySubString(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    
    public static void main(String args[]) {

        String str = "PeterParker";

        // substring
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(5));
        System.out.println(str.substring(2, 8));
        System.out.println(str.substring(0, 7));

        // mysubstring function
        System.out.println(mySubString("Arpit", 2, 5));
    }
}
