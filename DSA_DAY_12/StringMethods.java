package DSA_DAY_12;

public class StringMethods {
    
    public static void main(String args[]) {

        String flower = "Hibicus";
        System.out.println(flower);
        // System.out.println(flower.charAt(1));

        // Print every characters of a String
        for(int i=0; i<flower.length(); i++) {
            System.out.print(flower.charAt(i) + " ");
        }
        System.out.println();
        String s1 = "Biology";
        System.out.println(s1.charAt(1) + " " + s1.charAt(3) + " " + s1.charAt(6));

        System.out.println(flower.length());
    }
}
