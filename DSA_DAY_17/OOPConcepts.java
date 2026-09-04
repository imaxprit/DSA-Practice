package DSA_DAY_17;

public class OOPConcepts {
    public static void main(String args[]) {

        Animal dog = new Animal();
        // dog.run();
        dog.color = "Black";
        // System.out.println("Dog colour is "+dog.color);

        Animal jumbo = new Animal();
        jumbo.run();
        jumbo.eat();

        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(4);
        p1.setColor("Yellow");
        p1.setTip(7);
    }
}

class Animal {

    String color;

    void run() {
        System.out.println("In Running");
    }

    void eat() {
        System.out.println("I am eating..");
    }

}

class Pen {

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
        System.out.println("Pen color is "+color);
    }

    void setTip(int newTip) {
        tip = newTip;
        System.out.println("Pen tip is "+tip);
    }

}
