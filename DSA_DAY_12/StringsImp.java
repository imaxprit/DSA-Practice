package DSA_DAY_12;

import java.util.Scanner;

public class StringsImp {
    
    public static void main(String[] args) {
        
        String s1 = "Hello";
        // System.out.println(s1);

        // Input/Output
        Scanner sc = new Scanner(System.in);
        // String name;
        // System.out.print("Enter your name: ");
        // name = sc.nextLine();
        // System.out.println(s1 + ", " + name );

        // String Length
        System.out.println(s1);
        System.out.println(s1.length());

        // String Concatenate
        String firstName = "Arpit";
        String lastName = "Gupta";
        String fullName = firstName + " " + lastName;
        System.out.println("My name is " + fullName);

        sc.close();
    }
}
