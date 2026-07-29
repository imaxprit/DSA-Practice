package DSA_DAY_02;

public class ArrayUpdation {
    
    public static void main(String args[]) {

        int marks[] = {74, 85, 96, 69, 58, 47};

        int pos = 2;
        int newMarks = 84;

        marks[pos] = newMarks;

        for(int no : marks) {
            System.out.print(no + " ");
        }
        System.out.println();

        System.out.println("Marks updated");
    }
}
