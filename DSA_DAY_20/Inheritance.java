package DSA_DAY_20;

public class Inheritance {
    
    public static void main(String args[]) {

        // Car myCar = new Car();
        // myCar.start();
        // myCar.drive();

        Dog myDog = new Dog();
        myDog.eat();
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle Starts.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car Drives.");
    }
}

interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }
}


