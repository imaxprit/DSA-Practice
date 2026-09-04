package DSA_DAY_17;

public class OOPConcepts {
    public static void main(String args[]) {
        
        Animal dog = new Animal();
        dog.run();
        dog.color = "Black";
        System.out.println("Dog colour is "+dog.color);

        Animal jumbo = new Animal();
        jumbo.run();
    }
}

class Animal {

    String color;

    void run() {
        System.out.println("In Running");
    }

}
