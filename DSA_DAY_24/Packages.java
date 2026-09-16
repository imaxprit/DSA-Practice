package DSA_DAY_24; //User-Defined Packages

import java.util.Scanner;   //Built-in Packages

public class Packages {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Language: ");
        String language = sc.nextLine();
        System.out.println("Thanks to choose " + language + " language.");
        sc.close();

        Car c = new Car();
        c.startEngine();
    }
}

// Access Modifiers
class Car {
    private String model = "nex10";
    protected int speed = 40;
    public void startEngine() {
        System.out.println("Engine Started");
        System.out.println(model);
        System.out.println(speed);
    }
    
}