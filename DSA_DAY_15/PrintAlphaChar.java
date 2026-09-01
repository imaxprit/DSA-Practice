package DSA_DAY_15;

public class PrintAlphaChar {
    
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder();

        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sb.length());

    }
}
