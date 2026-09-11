package DSA_DAY_21;

public class Abstraction {
    
    public static void main(String args[]) {
        Vehicle myVehicle1 = new Car();
        myVehicle1.displayTyres();
        myVehicle1.start();

        System.out.println();

        Vehicle myVehicle2 = new Scooter();
        myVehicle2.displayTyres();
        myVehicle2.start();
    }

}

abstract class Vehicle {
    int no_of_tyres;

    void displayTyres() {
        System.out.println("This vehicle has " + no_of_tyres + " tyres.");
    }

    abstract void start();
}

class Car extends Vehicle {
    Car() {
        no_of_tyres = 4;
    }

    @Override 
    void start() {
        System.out.println("Car start with key ignition.");
    }
}

class Scooter extends Vehicle {
    Scooter()
    {
        no_of_tyres = 2;
    }
    @Override 
    void start() {
        System.out.println("Scooter starts with kick or self-start.");
    }   
}


