package DSA_DAY_19;

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();
        myCar.drive();
    }
}


class Vehicle {
    void start() {
        System.out.println("Vehicle Start");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car Drives");
    }
}
