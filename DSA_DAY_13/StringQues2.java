package DSA_DAY_13;

public class StringQues2 {
    
    // Given set of Strings print the largest string
    public static void printLargestString(String flowers[]) {
        String largest = flowers[0];
        for(int i=1; i<flowers.length; i++) {
            if(largest.compareTo(flowers[i]) < 0) {
                largest = flowers[i];
            }
        }
        System.out.println(largest);
    }
    

    public static void main(String args[]) {

        String flowers[] = {"Daizy", "Lotus", "Hibicus", "Lily"};
        printLargestString(flowers);
    }   
}
