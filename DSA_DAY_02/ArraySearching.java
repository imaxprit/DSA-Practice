package DSA_DAY_02;

public class ArraySearching {
    
    public static void main(String args[]) {

        int scores[] = {42, 27, 76, 94, 84, 39, 97, 48, 86, 65};
        int key = 90;
        boolean found = false;

        for(int i=0; i<scores.length; i++) {
            if(scores[i] == key) {
                System.out.println("Key found at index " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Key not found!");
        }
    }
}
