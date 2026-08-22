package DSA_DAY_14;

public class CharArr {
    
    public static void main(String args[]) {

        char ch = 'A';
        char digit = '6';
        char symbol = '#';

        System.out.println(ch);
        System.out.println(digit);
        System.out.println(symbol);

        char[] name = {'A', 'r', 'p', 'i', 't'};
        System.out.println(name);
        System.out.println(name[0]);

        for (char n : name) {
            System.out.print(n + " ");
        }
        System.out.println();

        String city = "Lucknow";
        System.out.println(city);
        for(int i=0; i<city.length(); i++) {
            System.out.print(city.charAt(i) + " ");
        }
        System.out.println();

        String message = "Hello Arpit, how are you?";
        System.out.println(message);
    }
}
