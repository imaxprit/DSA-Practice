package DSA_DAY_01;

public class ArrayProgram {
    public static void main(String args[]) {

        // Declare and create an array of size
        int[] marks = new int[6];

        // Initialize array elements
        marks[0] = 78;
        marks[1] = 45;
        marks[2] = 85;
        marks[3] = 68;
        marks[4] = 96;
        marks[5] = 57;

        // Access and print elements 
        System.out.print("Marks: ");
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // Using for-each loop
        for(int num : marks) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
