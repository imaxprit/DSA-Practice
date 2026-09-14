package DSA_DAY_22;

public class Interface {
    
    public static void main(String args[]) {
        Vehicle v = new Car();
        v.start();
        v.stop();

        Printable p1 = new Document();
        Printable p2 = new Image();

        p1.print();
        p2.print();
    }
}

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is Starting...");
    } 
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Document is Printing...");
    }
}

class Image implements Printable {
    public void print() {
        System.out.println("Printing Images...");
    }
}
