package DSA_DAY_23;

public class Encapsulation {
    
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("Hyundai");
        c.setSpeed(100);
        c.printDetails();
    }
}

class Car {
    private String brand;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed) {
        if(speed >= 0) {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}