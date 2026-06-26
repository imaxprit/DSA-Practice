package Arrays;

public class newArr {
    public static void main (String args[]) {

        int marks[] = {88, 74, 91, 82, 68, 94};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks.length);


        // Traversal
        for(int no : marks) {
            System.out.print(no + " ");
        }

        // Insertion
        for(int i=0; i<marks.length; i++) {
            if(marks[i] == marks[2]) {
                marks[i] = 82;
                System.out.print(marks[i] + " ");
            }
            
            
        }
    }
}
