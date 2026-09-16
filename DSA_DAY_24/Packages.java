package DSA_DAY_24;

import java.util.Scanner;   //Built-in Packages

public class Packages {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Language: ");
        String language = sc.nextLine();
        System.out.println("Thanks to choose " + language + " language.");
        sc.close();
    }
}
